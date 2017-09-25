package com.github.georgealvessilveira.jooq_extension_lib.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.jooq.DSLContext;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.georgealvessilveira.jooq_extension_lib.DAO;
import com.github.georgealvessilveira.jooq_extension_lib.Databases;
import com.github.georgealvessilveira.jooq_extension_lib.jooqs.TblUsuario;
import com.github.georgealvessilveira.jooq_extension_lib.models.TipoUsuario;
import com.github.georgealvessilveira.jooq_extension_lib.models.Usuario;

import javaslang.collection.List;
import javaslang.control.Option;

public class DAOTest {

    private DAO dao;
    private static Integer id = 1000;

    private void iniciaDAO(DSLContext dsl) {
	dao = DAO.newInstance(dsl, Usuario.class, TblUsuario.TBL_USUARIO);
    }

    private Usuario iniciaUsuario() {
	return new Usuario("George", "george@mail.com", "george", "123", TipoUsuario.ADMINISTRADOR, true)
		.setDataCriacao(LocalDateTime.of(2017, 4, 1, 0, 0));
    }

    @BeforeClass
    public static void limpaUsuarioDeId1000DoBancoDeDados() {
	Databases.transaction(dsl -> {
	    dsl.deleteFrom(TblUsuario.TBL_USUARIO).where(TblUsuario.TBL_USUARIO.ID.eq(id)).execute();
	    dsl.deleteFrom(TblUsuario.TBL_USUARIO).where(TblUsuario.TBL_USUARIO.ID.eq(id + 1)).execute();
	    dsl.deleteFrom(TblUsuario.TBL_USUARIO).where(TblUsuario.TBL_USUARIO.ID.eq(id + 2)).execute();
	});
    }

    @Test
    public void salvaUsuarioNoBancoDeDados() {
	Databases.transaction(dsl -> {
	    this.iniciaDAO(dsl);
	    Usuario usuario = iniciaUsuario().setId(id);
	    Integer id = dao.save(usuario);
	    assertEquals(usuario.getId(), id);
	});
    }

    @Test
    public void listaUsuarioPorNomeNoBancoDeDados() {
	Databases.open(dsl -> {
	    this.iniciaDAO(dsl);
	    String nomeUsuario = "ADMIN";
	    List<Usuario> usuario = dao.listBy("nome", nomeUsuario);
	    assertEquals(nomeUsuario, usuario.get(0).getNome());
	});
    }

    @Test
    public void buscaUsuarioPorIdNoBancoDeDados() {
	Databases.open(dsl -> {
	    this.iniciaDAO(dsl);
	    long id = 1;
	    Option<Usuario> usuarioOpt = dao.getById(1);
	    Usuario usuario = usuarioOpt.get();
	    assertEquals(id, usuario.getId().longValue());
	});
    }

    @Test
    public void listaUsuariosPorNomesSemelhantesDoBancoDeDados() {
	Databases.open(dsl -> {
	    this.iniciaDAO(dsl);
	    String nome = "Alves";
	    dao.save(iniciaUsuario().setId(id + 1).setNome(nome));
	    dao.save(iniciaUsuario().setId(id + 2).setNome(nome));
	    List<Usuario> usuarios = dao.listByLike("nome", nome);
	    assertEquals(nome, usuarios.get(0).getNome());
	    assertEquals(nome, usuarios.get(1).getNome());
	});
    }

    @Test
    public void editaUsuarioDoBancoDeDados() {
	Databases.transaction(dsl -> {
	    this.iniciaDAO(dsl);
	    Usuario usuario = (Usuario) dao.getById(1).get();
	    usuario.setEmail("admin@mail.com");
	    boolean atualizou = dao.update(usuario);
	    assertTrue(atualizou);
	});
    }

    @Test
    public void deletaUsuarioDoBancoDeDados() {
	Databases.transaction(dsl -> {
	    this.iniciaDAO(dsl);
	    Usuario usuario = this.iniciaUsuario().setId(id + 3);
	    Integer lastInsertedId = dao.save(usuario);
	    assertEquals(usuario.getId(), lastInsertedId);
	    boolean deletou = dao.delete(usuario);
	    assertTrue(deletou);
	});
    }

    @Test
    public void listaUsuariosPorAtivosNoBancoDeDados() {
	Databases.open(dsl -> {
	    this.iniciaDAO(dsl);
	    List<Usuario> usuarios = dao.listBy("ativo", true);
	    boolean empty = usuarios.isEmpty();
	    assertFalse(empty);
	    usuarios.forEach(usuario -> assertTrue(usuario.isAtivo()));
	});
    }
}
