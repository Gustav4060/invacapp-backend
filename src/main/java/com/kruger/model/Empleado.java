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

import com.kruger.enumeration.EstadoVacunacionEnum;
import com.kruger.enumeration.TipoVacunaEnum;

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
	private String direccion;

	@Column(name = "telefono", length = 10)
	private String telefono;

	@Column(name = "estadoVacunacion", length = 1)
	@Enumerated(EnumType.STRING)
	private EstadoVacunacionEnum estadoVacunacion;

	@Column(name = "tipoVacuna" , length = 2)
	@Enumerated(EnumType.STRING)
	private TipoVacunaEnum tipoVacuna;

	@Column(name = "fechaVacunacion")
	private LocalDate fechaVacunacion;

	@Column(name = "numeroDosis")
	private Integer numeroDosis;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setEstadoVacunacion(EstadoVacunacionEnum estadoVacunacion) {
		this.estadoVacunacion = estadoVacunacion;
	}

	public void setTipoVacuna(TipoVacunaEnum tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}

	public void setFechaVacunacion(LocalDate fechaVacunacion) {
		this.fechaVacunacion = fechaVacunacion;
	}

	public void setNumeroDosis(Integer numeroDosis) {
		this.numeroDosis = numeroDosis;
	}

	public String getCedula() {
		return cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public EstadoVacunacionEnum getEstadoVacunacion() {
		return estadoVacunacion;
	}

	public TipoVacunaEnum getTipoVacuna() {
		return tipoVacuna;
	}

	public LocalDate getFechaVacunacion() {
		return fechaVacunacion;
	}

	public Integer getNumeroDosis() {
		return numeroDosis;
	}

	

}
