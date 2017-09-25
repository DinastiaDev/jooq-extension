/**
 * This class is generated by jOOQ
 */
package com.github.georgealvessilveira.jooq_extension_lib.jooqs;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

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
public class TblUsuarioRecord extends UpdatableRecordImpl<TblUsuarioRecord> implements Record11<Integer, String, String, String, String, TipoUsuario, Boolean, Boolean, Timestamp, Timestamp, Timestamp> {

	private static final long serialVersionUID = 1950515550;

	/**
	 * Setter for <code>public.tbl_usuario.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.tbl_usuario.nome</code>.
	 */
	public void setNome(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.nome</code>.
	 */
	public String getNome() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.tbl_usuario.email</code>.
	 */
	public void setEmail(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.tbl_usuario.usuario</code>.
	 */
	public void setUsuario(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.usuario</code>.
	 */
	public String getUsuario() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>public.tbl_usuario.senha</code>.
	 */
	public void setSenha(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.senha</code>.
	 */
	public String getSenha() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.tbl_usuario.tipo_usuario</code>.
	 */
	public void setTipoUsuario(TipoUsuario value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.tipo_usuario</code>.
	 */
	public TipoUsuario getTipoUsuario() {
		return (TipoUsuario) getValue(5);
	}

	/**
	 * Setter for <code>public.tbl_usuario.ativo</code>.
	 */
	public void setAtivo(Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.ativo</code>.
	 */
	public Boolean getAtivo() {
		return (Boolean) getValue(6);
	}

	/**
	 * Setter for <code>public.tbl_usuario.excluido</code>.
	 */
	public void setExcluido(Boolean value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.excluido</code>.
	 */
	public Boolean getExcluido() {
		return (Boolean) getValue(7);
	}

	/**
	 * Setter for <code>public.tbl_usuario.data_criacao</code>.
	 */
	public void setDataCriacao(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.data_criacao</code>.
	 */
	public Timestamp getDataCriacao() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>public.tbl_usuario.data_alteracao</code>.
	 */
	public void setDataAlteracao(Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.data_alteracao</code>.
	 */
	public Timestamp getDataAlteracao() {
		return (Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>public.tbl_usuario.data_exclusao</code>.
	 */
	public void setDataExclusao(Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>public.tbl_usuario.data_exclusao</code>.
	 */
	public Timestamp getDataExclusao() {
		return (Timestamp) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, String, String, String, String, TipoUsuario, Boolean, Boolean, Timestamp, Timestamp, Timestamp> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, String, String, String, String, TipoUsuario, Boolean, Boolean, Timestamp, Timestamp, Timestamp> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TblUsuario.TBL_USUARIO.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TblUsuario.TBL_USUARIO.NOME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TblUsuario.TBL_USUARIO.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TblUsuario.TBL_USUARIO.USUARIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TblUsuario.TBL_USUARIO.SENHA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<TipoUsuario> field6() {
		return TblUsuario.TBL_USUARIO.TIPO_USUARIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field7() {
		return TblUsuario.TBL_USUARIO.ATIVO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field8() {
		return TblUsuario.TBL_USUARIO.EXCLUIDO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return TblUsuario.TBL_USUARIO.DATA_CRIACAO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field10() {
		return TblUsuario.TBL_USUARIO.DATA_ALTERACAO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return TblUsuario.TBL_USUARIO.DATA_EXCLUSAO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getNome();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getUsuario();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getSenha();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TipoUsuario value6() {
		return getTipoUsuario();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value7() {
		return getAtivo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value8() {
		return getExcluido();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getDataCriacao();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value10() {
		return getDataAlteracao();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getDataExclusao();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value2(String value) {
		setNome(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value3(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value4(String value) {
		setUsuario(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value5(String value) {
		setSenha(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value6(TipoUsuario value) {
		setTipoUsuario(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value7(Boolean value) {
		setAtivo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value8(Boolean value) {
		setExcluido(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value9(Timestamp value) {
		setDataCriacao(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value10(Timestamp value) {
		setDataAlteracao(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord value11(Timestamp value) {
		setDataExclusao(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TblUsuarioRecord values(Integer value1, String value2, String value3, String value4, String value5, TipoUsuario value6, Boolean value7, Boolean value8, Timestamp value9, Timestamp value10, Timestamp value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TblUsuarioRecord
	 */
	public TblUsuarioRecord() {
		super(TblUsuario.TBL_USUARIO);
	}

	/**
	 * Create a detached, initialised TblUsuarioRecord
	 */
	public TblUsuarioRecord(Integer id, String nome, String email, String usuario, String senha, TipoUsuario tipoUsuario, Boolean ativo, Boolean excluido, Timestamp dataCriacao, Timestamp dataAlteracao, Timestamp dataExclusao) {
		super(TblUsuario.TBL_USUARIO);

		setValue(0, id);
		setValue(1, nome);
		setValue(2, email);
		setValue(3, usuario);
		setValue(4, senha);
		setValue(5, tipoUsuario);
		setValue(6, ativo);
		setValue(7, excluido);
		setValue(8, dataCriacao);
		setValue(9, dataAlteracao);
		setValue(10, dataExclusao);
	}
}
