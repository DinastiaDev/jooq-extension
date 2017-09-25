package com.github.georgealvessilveira.jooq_extension_lib.models;

import java.util.Objects;

import javax.persistence.Column;

import com.github.georgealvessilveira.jooq_extension_lib.IEntity;

public class Usuario extends Entidade<Usuario> implements IEntity {

    private static final long serialVersionUID = 1L;
    @Column(name = "nome")
    private String nome = "";
    @Column(name = "email")
    private String email = "";
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "senha")
    private String senha;
    @Column(name = "tipo_usuario")
    private TipoUsuario tipoUsuario;
    @Column(name = "ativo")
    private boolean ativo = true;

    public Usuario() {
	// Vazio
    }

    public Usuario(String nome, String email, String usuario, String senha, TipoUsuario tipoUsuario, boolean ativo) {
	super();
	this.nome = nome;
	this.email = email;
	this.usuario = usuario;
	this.senha = senha;
	this.tipoUsuario = tipoUsuario;
	this.ativo = ativo;
    }

    public String getNome() {
	return nome;
    }

    public Usuario setNome(String nome) {
	this.nome = nome;
	return this;
    }

    public String getEmail() {
	return email;
    }

    public Usuario setEmail(String email) {
	this.email = email;
	return this;
    }

    public String getUsuario() {
	return usuario;
    }

    public Usuario setUsuario(String usuario) {
	this.usuario = usuario;
	return this;
    }

    public String getSenha() {
	return senha;
    }

    public Usuario setSenha(String senha) {
	this.senha = Objects.requireNonNull(senha);
	return this;
    }

    public TipoUsuario getTipoUsuario() {
	return tipoUsuario;
    }

    public Usuario setTipoUsuario(TipoUsuario tipoUsuario) {
	this.tipoUsuario = tipoUsuario;
	return this;
    }

    public boolean isAtivo() {
	return ativo;
    }

    public Usuario setAtivo(boolean ativo) {
	this.ativo = ativo;
	return this;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder("Pessoa (");
	sb.append(getId()).append(", ").append(getNome()).append(", ").append(isExcluido()).append(", ")
		.append(getDataCriacao()).append(", ").append(getDataAlteracao()).append(", ").append(getDataExclusao())
		.append(")");
	return sb.toString();
    }
}
