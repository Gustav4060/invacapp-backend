package com.kruger.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 
 * @author Gustavo Parco
 *
 */
@Schema(description = "Usuario DATA")
public class UsuarioContraseniaDTO {

	private String userName;
	private String password;

	public UsuarioContraseniaDTO() {
		super();
	}

	public UsuarioContraseniaDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
