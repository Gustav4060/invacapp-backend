package com.kruger.service;

import java.util.List;

/**
 * 
 * @author Gustavo Parco
 *
 * @param <T>
 * @param <ID>
 */
public interface ICRUD<T, ID> {

	T registrar(T t) throws Exception;

	T modificar(T t) throws Exception;

	List<T> listar() throws Exception;

	T listarPorId(ID id) throws Exception;

	void eliminar(ID id) throws Exception;
}
