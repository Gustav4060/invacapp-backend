package com.kruger.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kruger.enumeration.EstadoVacunacionEnum;
import com.kruger.enumeration.TipoVacunaEnum;
import com.kruger.model.Empleado;

public interface IEmpleadoRepo extends IGenericRepo<Empleado, Long> {

	@Query(value="From Empleado e where e.estadoVacunacion=:estadoVacunacion")
	List<Empleado> listarEmpleadorPorEstadoVacunacion(@Param("estadoVacunacion") EstadoVacunacionEnum estadoVacunacion);

	
	@Query(value="From Empleado e where e.tipoVacuna=:tipoVacuna")
	List<Empleado> listarEmpleadorPorTipoVacuna(@Param("tipoVacuna") TipoVacunaEnum tipoVacuna);

	@Query(value = "From Empleado e where e.fechaVacunacion between :fechaInicio AND :fechaFin")
	List<Empleado> listaEmpleadorEntre(@Param("fechaInicio") LocalDate fechaInicio,
			@Param("fechaFin") LocalDate fechaFin);

}
