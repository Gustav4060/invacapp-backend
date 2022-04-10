package com.kruger.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kruger.enumeration.EstadoVacunacionEnum;
import com.kruger.enumeration.TipoVacunaEnum;
import com.kruger.model.Empleado;

public interface IEmpleadoRepo extends IGenericRepo<Empleado, Long> {

	List<Empleado> findByEstadoVacunacion(EstadoVacunacionEnum estadoVacunacion);

	List<Empleado> findByTipoVacuna(TipoVacunaEnum tipoVacuna);

	@Query(value = "select e.* from empleado where fechaVacunacion between :fechaInicio AND :fechaFin", nativeQuery = true)
	List<Empleado> listaEmpleadorEntre(@Param("fechaInicio") LocalDate fechaInicio,
			@Param("fechaFin") LocalDate fechaFin);

}
