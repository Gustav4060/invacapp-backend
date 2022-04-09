package com.kruger;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.kruger.model.Usuario;
import com.kruger.repo.IUsuarioRepo;

@SpringBootTest
class InvacappBackendApplicationTests {

	@Autowired
	private IUsuarioRepo repo;

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	/*
	 * @Test void escenario1() { Usuario us = new Usuario(); us.setIdUsuario(4);
	 * us.setUsername("0604462937"); us.setPassword(bcrypt.encode("123"));
	 * us.setEnabled(true);
	 * 
	 * Usuario retorno = repo.save(us);
	 * assertTrue(retorno.getPassword().equals(us.getPassword())); }
	 */

}