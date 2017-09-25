package com.github.georgealvessilveira.jooq_extension_lib.models;

import java.io.Serializable;

/**
 * Interface utilizada para marcar objetos que serão utilizados
 * para serem persistidos.
 * @author Guilherme A. Silveira.
 *
 */
public interface IEntidade<T extends Number> extends Serializable {
	T getId();
}