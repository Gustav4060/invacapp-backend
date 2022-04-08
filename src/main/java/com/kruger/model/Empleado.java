/**
 * 
 */
package com.kruger.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kruger.enumeration.EstadoVacunacion;
import com.kruger.enumeration.TipoVacuna;

/**
 * @author gparcos
 *
 */
@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "cedula", nullable = false, length = 10)
	private String cedula;

	@Column(name = "nombres", nullable = false, length = 100)
	private String nombres;

	@Column(name = "apellidos", nullable = false, length = 100)
	private String apellidos;

	@Column(name = "correo", length = 100)
	private String correo;

	@Column(name = "fechaNacimiento")
	private LocalDate fechaNacimiento;

	@Column(name = "direccion", length = 200)
	private LocalDate direccion;

	@Column(name = "telefono", length = 10)
	private LocalDate telefono;

	@Column(name = "estadoVacunacion", length = 1)
	@Enumerated(EnumType.STRING)
	private EstadoVacunacion estadoVacunacion;

	@Column(name = "tipoVacuna" , length = 2)
	@Enumerated(EnumType.STRING)
	private TipoVacuna tipoVacuna;

	@Column(name = "fechaVacunacion")
	private LocalDate fechaVacunacion;

	@Column(name = "numeroDosis")
	private Integer numeroDosis;

}
