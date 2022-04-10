package com.kruger.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl {

	public boolean tieneAcceso(String path) {

		boolean rpta = false;

		String metodoRol = "";

		switch (path) {
		case "listar":
			metodoRol = "ADMIN";
			break;

		case "listarPorId":
			metodoRol = "ADMIN,EMP";
			break;

		case "registrar":
			metodoRol = "ADMIN";
			break;

		case "modificar":
			metodoRol = "ADMIN,EMP";
			break;

		case "eliminar":
			metodoRol = "ADMIN";
			break;

		case "darAlta":
			metodoRol = "ADMIN";
			break;

		case "consultaTipoVacuna":
			metodoRol = "ADMIN";
			break;
			
		case "consultaEstadoVacuna":
			metodoRol = "ADMIN";
			break;
			
		case "consultaRangoFechas":
			metodoRol = "ADMIN";
			break;

		}

		String metodoRoles[] = metodoRol.split(",");

		Authentication usuarioLogueado = SecurityContextHolder.getContext().getAuthentication();

		System.out.println(usuarioLogueado.getName());

		for (GrantedAuthority auth : usuarioLogueado.getAuthorities()) {
			String rolUser = auth.getAuthority();
			System.out.println(rolUser);

			for (String rolMet : metodoRoles) {
				if (rolUser.equalsIgnoreCase(rolMet)) {
					rpta = true;
				}
			}
		}

		return rpta;
	}
}
