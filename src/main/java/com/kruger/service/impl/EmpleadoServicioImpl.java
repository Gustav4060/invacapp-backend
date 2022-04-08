package com.kruger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.model.Empleado;
import com.kruger.repo.IEmpleadoRepo;
import com.kruger.service.ICRUD;

public class EmpleadoServicioImpl extends CRUDImpl<Empleado, Long> implements ICRUD<Empleado, Long> {

	@Autowired
	private IEmpleadoRepo iEmpleadoRepo;

	@Override
	protected JpaRepository<Empleado, Long> getRepo() {
		// TODO Auto-generated method stub
		return iEmpleadoRepo;
	}

}
