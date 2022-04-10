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
	 * @Test void escenario1() { Usuario us = new Usuario();
	 * us.setUsername("Admin"); us.setPassword(bcrypt.encode("Admin"));
	 * us.setEnabled(true); us.setCedula("0604462937");
	 * 
	 * Usuario retorno = repo.save(us);
	 * assertTrue(retorno.getPassword().equals(us.getPassword())); }
	 */

}