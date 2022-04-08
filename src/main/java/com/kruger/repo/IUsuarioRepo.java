package com.kruger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kruger.model.Usuario;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

	// from usuario where username = ?
	// Derived Query
	Usuario findOneByUsername(String username);
}
