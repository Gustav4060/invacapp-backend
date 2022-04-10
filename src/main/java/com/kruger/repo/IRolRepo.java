package com.kruger.repo;

import java.util.List;

import com.kruger.model.Rol;

public interface IRolRepo extends IGenericRepo<Rol, Integer>{

	List<Rol> findByNombre(String nombre);
}
