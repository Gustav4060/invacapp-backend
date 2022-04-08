package com.kruger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kruger.model.Empleado;

@Repository
public interface IEmpleadoRepo extends JpaRepository<Empleado, Long> {

}
