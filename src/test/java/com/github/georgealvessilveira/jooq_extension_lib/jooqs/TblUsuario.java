/**
 * This class is generated by jOOQ
 */
package com.github.georgealvessilveira.jooq_extension_lib.jooqs;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import com.github.georgealvessilveira.jooq_extension_lib.models.TipoUsuario;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblUsuario extends TableImpl<TblUsuarioRecord> {

	private static final long serialVersionUID = 1670654157;

	/**
	 * The reference instance of <code>public.tbl_usuario</code>
	 */
	public static final TblUsuario TBL_USUARIO = new TblUsuario();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TblUsuarioRecord> getRecordType() {
		return TblUsuarioRecord.class;
	}

	/**
	 * The column <code>public.tbl_usuario.id</code>.
	 */
	public final TableField<TblUsuarioRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.tbl_usuario.nome</code>.
	 */
	public final TableField<TblUsuarioRecord, String> NOME = createField("nome", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>public.tbl_usuario.email</code>.
	 */
	public final TableField<TblUsuarioRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.tbl_usuario.usuario</code>.
	 */
	public final TableField<TblUsuarioRecord, String> USUARIO = createField("usuario", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>public.tbl_usuario.senha</code>.
	 */
	public final TableField<TblUsuarioRecord, String> SENHA = createField("senha", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>public.tbl_usuario.tipo_usuario</code>.
	 */
	public final TableField<TblUsuarioRecord, TipoUsuario> TIPO_USUARIO = createField("tipo_usuario", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.github.georgealvessilveira.jooq_extension_lib.models.TipoUsuario.class), this, "");

	/**
	 * The column <code>public.tbl_usuario.ativo</code>.
	 */
	public final TableField<TblUsuarioRecord, Boolean> ATIVO = createField("ativo", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.tbl_usuario.excluido</code>.
	 */
	public final TableField<TblUsuarioRecord, Boolean> EXCLUIDO = createField("excluido", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.tbl_usuario.data_criacao</code>.
	 */
	public final TableField<TblUsuarioRecord, Timestamp> DATA_CRIACAO = createField("data_criacao", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>public.tbl_usuario.data_alteracao</code>.
	 */
	public final TableField<TblUsuarioRecord, Timestamp> DATA_ALTERACAO = createField("data_alteracao", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.tbl_usuario.data_exclusao</code>.
	 */
	public final TableField<TblUsuarioRecord, Timestamp> DATA_EXCLUSAO = createField("data_exclusao", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>public.tbl_usuario</code> table reference
	 */
	public TblUsuario() {
		this("tbl_usuario", null);
	}

	/**
	 * Create an aliased <code>public.tbl_usuario</code> table reference
	 */
	public TblUsuario(String alias) {
		this(alias, TBL_USUARIO);
	}

	private TblUsuario(String alias, Table<TblUsuarioRecord> aliased) {
		this(alias, aliased, null);
	}

	private TblUsuario(String alias, Table<TblUsuarioRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TblUsuarioRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TBL_USUARIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TblUsuarioRecord> getPrimaryKey() {
		return Keys.TBL_USUARIO_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TblUsuarioRecord>> getKeys() {
		return Arrays.<UniqueKey<TblUsuarioRecord>>asList(Keys.TBL_USUARIO_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuario as(String alias) {
		return new TblUsuario(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TblUsuario rename(String name) {
		return new TblUsuario(name, null);
	}
}