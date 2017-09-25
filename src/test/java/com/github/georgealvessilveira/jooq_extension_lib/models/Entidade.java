package com.github.georgealvessilveira.jooq_extension_lib.models;

import static java.util.Objects.requireNonNull;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

import javax.persistence.Column;

@SuppressWarnings("unchecked")
public abstract class Entidade<T extends Entidade<T>> implements IEntidade<Integer>, Comparable<Entidade<T>> {

	private static final long serialVersionUID = -1L;
	@Column(name = "id")
	private Integer id = -1;
	@Column(name = "excluido")
	private boolean excluido = false;
	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;
	@Column(name = "data_alteracao")
	private LocalDateTime dataAlteracao;
	@Column(name = "data_exclusao")
	private LocalDateTime dataExclusao;

	public Entidade() {
		// Vazio
	}

	public Entidade(Integer id, boolean excluido, LocalDateTime dataCriacao, LocalDateTime dataAlteracao,
			LocalDateTime dataExclusao) {
		this.setId(id).setExcluido(excluido).setDataCriacao(dataCriacao).setDataAlteracao(dataAlteracao)
				.setDataExclusao(dataExclusao);
	}

	@Override
	public Integer getId() {
		return id;
	}

	public T setId(Integer id) {
		this.id = requireNonNull(id);
		return (T) this;
	}

	public Boolean isExcluido() {
		return excluido;
	}

	public T setExcluido(boolean excluido) {
		this.excluido = excluido;
		return (T) this;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public T setDataCriacao(LocalDateTime dataCriacao) {
		if (null == dataCriacao) {
			dataCriacao = LocalDateTime.now();
		} else {
			this.dataCriacao = dataCriacao;
		}
		return (T) this;
	}

	public Optional<LocalDateTime> getDataAlteracao() {
		if (null == dataAlteracao)
			return Optional.empty();
		return Optional.of(dataAlteracao);
	}

	public T setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = Objects.requireNonNull(dataAlteracao);
		return (T) this;
	}

	public Optional<LocalDateTime> getDataExclusao() {
		if (null == dataExclusao)
			return Optional.empty();
		return Optional.of(dataExclusao);
	}

	public T setDataExclusao(LocalDateTime dataExclusao) {
		this.dataExclusao = Objects.requireNonNull(dataExclusao);
		return (T) this;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}
		final Entidade<T> other = (Entidade<T>) obj;
		return Objects.equals(this.id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Ingrediente (");
		sb.append(id).append(", ").append(excluido).append(", ").append(dataCriacao).append(", ").append(dataAlteracao)
				.append(", ").append(dataExclusao).append(")");
		return sb.toString();
	}

	@Override
	public int compareTo(Entidade<T> other) {
		return Integer.compare(this.id, requireNonNull(other).id);
	}
}