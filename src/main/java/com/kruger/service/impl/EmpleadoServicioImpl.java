package com.kruger.service.impl;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kruger.dto.UsuarioContraseniaDTO;
import com.kruger.enumeration.EstadoVacunacionEnum;
import com.kruger.enumeration.TipoVacunaEnum;
import com.kruger.model.Empleado;
import com.kruger.model.Rol;
import com.kruger.model.Usuario;
import com.kruger.repo.IEmpleadoRepo;
import com.kruger.repo.IGenericRepo;
import com.kruger.repo.IRolRepo;
import com.kruger.repo.IUsuarioRepo;
import com.kruger.service.IEmpleadoService;

@Service
public class EmpleadoServicioImpl extends CRUDImpl<Empleado, Long> implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo iEmpleadoRepo;

	@Autowired
	private IUsuarioRepo repoUsuario;

	@Autowired
	private IRolRepo repoRol;

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Override
	protected IGenericRepo<Empleado, Long> getRepo() {
		return iEmpleadoRepo;
	}
	@Override
	@Transactional
	public UsuarioContraseniaDTO darAltaEmpleador(Empleado emp) {
		Empleado empleado= this.getRepo().save(emp);
		List<Rol> roles = repoRol.findByNombre("EMP");
		Usuario usuario = new Usuario(empleado.getCorreo(), bcrypt.encode(empleado.getCedula()), true, roles, empleado.getCedula());
		repoUsuario.save(usuario);
		return new UsuarioContraseniaDTO(empleado.getCorreo(), empleado.getCedula());
	}
	@Override
	public List<Empleado> buscarPorEstadoVacunacion(EstadoVacunacionEnum estadoVacunacion) {
		
		return iEmpleadoRepo.listarEmpleadorPorEstadoVacunacion(estadoVacunacion);
	}
	@Override
	public List<Empleado> buscarPorTipoVacuna(TipoVacunaEnum tipoVacuna) {
		
		return iEmpleadoRepo.listarEmpleadorPorTipoVacuna(tipoVacuna);
	}
	@Override
	public List<Empleado> buscarPorFechaVacunacion(LocalDate fechaInicio, LocalDate fechaFin) {
		
		return iEmpleadoRepo.listaEmpleadorEntre(fechaInicio, fechaFin);
	}
	
	
	

	

}
