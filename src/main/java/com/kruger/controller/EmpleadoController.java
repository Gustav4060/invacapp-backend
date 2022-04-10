package com.kruger.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kruger.dto.ConsultasDTO;
import com.kruger.dto.EmpleadoDTO;
import com.kruger.dto.UsuarioContraseniaDTO;
import com.kruger.exception.ModeloNotFoundException;
import com.kruger.model.Empleado;
import com.kruger.service.IEmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService service;

	@Autowired
	private ModelMapper mapper;

	@PreAuthorize("@authServiceImpl.tieneAcceso('listar')")
	@GetMapping
	public ResponseEntity<List<EmpleadoDTO>> listar() throws Exception {
		List<EmpleadoDTO> lista = service.listar().stream().map(p -> mapper.map(p, EmpleadoDTO.class))
				.collect(Collectors.toList());
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}

	@PreAuthorize("@authServiceImpl.tieneAcceso('listarPorId')")
	@GetMapping("/{id}")
	public ResponseEntity<EmpleadoDTO> listarPorId(@PathVariable("id") Long id) throws Exception {
		EmpleadoDTO dtoResponse;
		Empleado obj = service.listarPorId(id); // Empleado

		if (obj == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		} else {
			dtoResponse = mapper.map(obj, EmpleadoDTO.class); // EmpleadoDTO
		}

		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

	@PreAuthorize("@authServiceImpl.tieneAcceso('registrar')")
	@PostMapping
	public ResponseEntity<EmpleadoDTO> registrar(@Valid @RequestBody EmpleadoDTO dtoRequest) throws Exception {
		Empleado p = mapper.map(dtoRequest, Empleado.class);
		Empleado obj = service.registrar(p);
		EmpleadoDTO dtoResponse = mapper.map(obj, EmpleadoDTO.class);
		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

	@PreAuthorize("@authServiceImpl.tieneAcceso('modificar')")
	@PutMapping
	public ResponseEntity<EmpleadoDTO> modificar(@RequestBody EmpleadoDTO dtoRequest) throws Exception {
		Empleado pac = service.listarPorId(dtoRequest.getId());

		if (pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + dtoRequest.getId());
		}

		Empleado p = mapper.map(dtoRequest, Empleado.class);

		Empleado obj = service.modificar(p);

		EmpleadoDTO dtoResponse = mapper.map(obj, EmpleadoDTO.class);

		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

	@PreAuthorize("@authServiceImpl.tieneAcceso('eliminar')")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Long id) throws Exception {
		Empleado pac = service.listarPorId(id);

		if (pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}

		service.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/hateoas/{id}")
	public EntityModel<EmpleadoDTO> listarHateoasPorId(@PathVariable("id") Long id) throws Exception {
		Empleado obj = service.listarPorId(id);

		if (obj == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}

		EmpleadoDTO dto = mapper.map(obj, EmpleadoDTO.class);

		EntityModel<EmpleadoDTO> recurso = EntityModel.of(dto);
		// localhost:8080/Empleados/1
		WebMvcLinkBuilder link1 = linkTo(methodOn(this.getClass()).listarPorId(id));
		WebMvcLinkBuilder link2 = linkTo(methodOn(this.getClass()).listarHateoasPorId(id));
		recurso.add(link1.withRel("Empleado-recurso1"));
		recurso.add(link2.withRel("Empleado-recurso2"));

		return recurso;
	}

	@PreAuthorize("@authServiceImpl.tieneAcceso('darAlta')")
	@PostMapping("/darAlta")
	public ResponseEntity<UsuarioContraseniaDTO> darAlta(@Valid @RequestBody EmpleadoDTO dtoRequest) throws Exception {
		Empleado p = mapper.map(dtoRequest, Empleado.class);
		UsuarioContraseniaDTO ucDto = service.darAltaEmpleador(p);
		return new ResponseEntity<>(ucDto, HttpStatus.OK);
	}

	@PreAuthorize("@authServiceImpl.tieneAcceso('consultaTipoVacuna')")
	@PostMapping("/consultaTipoVacuna")
	public ResponseEntity<EmpleadoDTO> consultaTipoVacuna(@Valid @RequestBody ConsultasDTO dtoRequest) throws Exception {
		List<Empleado> obj = service.buscarPorTipoVacuna(dtoRequest.getTipoVacunacion());
		EmpleadoDTO dtoResponse = mapper.map(obj, EmpleadoDTO.class);
		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}
	
	@PreAuthorize("@authServiceImpl.tieneAcceso('consultaEstadoVacuna')")
	@PostMapping("/consultaEstadoVacuna")
	public ResponseEntity<EmpleadoDTO> consultaEstadoVacuna(@Valid @RequestBody ConsultasDTO dtoRequest) throws Exception {
		List<Empleado> obj = service.buscarPorEstadoVacunacion(dtoRequest.getEstadoVacunacion());
		EmpleadoDTO dtoResponse = mapper.map(obj, EmpleadoDTO.class);
		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}
	
	@PreAuthorize("@authServiceImpl.tieneAcceso('consultaRangoFechas')")
	@PostMapping("/consultaRangoFechas")
	public ResponseEntity<EmpleadoDTO> consultaRangoFechas(@Valid @RequestBody ConsultasDTO dtoRequest) throws Exception {
		List<Empleado> obj = service.buscarPorFechaVacunacion(dtoRequest.getFechaInicio(), dtoRequest.getFechaFin()); 
		EmpleadoDTO dtoResponse = mapper.map(obj, EmpleadoDTO.class);
		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

}
