package com.kruger.repo;

import com.kruger.model.Usuario;

/**
 * 
 * @author Gustavo Parco
 *
 */
public interface IUsuarioRepo extends IGenericRepo<Usuario, Integer> {

	// from usuario where username = ?
	// Derived Query
	Usuario findOneByUsername(String username);
}
