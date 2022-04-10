package com.kruger.service;

import java.time.LocalDate;
import java.util.List;

import com.kruger.dto.UsuarioContraseniaDTO;
import com.kruger.enumeration.EstadoVacunacionEnum;
import com.kruger.enumeration.TipoVacunaEnum;
import com.kruger.model.Empleado;

public interface IEmpleadoService extends ICRUD<Empleado, Long> {
	
	public UsuarioContraseniaDTO darAltaEmpleador(Empleado emp);

	public List<Empleado> buscarPorEstadoVacunacion(EstadoVacunacionEnum estadoVacunacion);

	public List<Empleado> buscarPorTipoVacuna(TipoVacunaEnum tipoVacuna);

	public List<Empleado> buscarPorFechaVacunacion(LocalDate fechaInicio, LocalDate fechaFin);

}
