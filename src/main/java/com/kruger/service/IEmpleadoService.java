package com.kruger.service;

import com.kruger.dto.UsuarioContraseniaDTO;
import com.kruger.model.Empleado;

public interface IEmpleadoService extends ICRUD<Empleado, Long> {
	public UsuarioContraseniaDTO darAltaEmpleador(Empleado emp);
}
