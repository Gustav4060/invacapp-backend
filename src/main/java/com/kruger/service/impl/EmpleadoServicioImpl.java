package com.kruger.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kruger.model.Empleado;
import com.kruger.repo.IEmpleadoRepo;
import com.kruger.repo.IGenericRepo;
import com.kruger.service.ICRUD;
import com.kruger.service.IEmpleadoService;

@Component("beanName1")
public class EmpleadoServicioImpl extends CRUDImpl<Empleado, Long> implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo iEmpleadoRepo;

	@Override
	protected IGenericRepo<Empleado, Long> getRepo() {
		return iEmpleadoRepo;
	}

	

}
