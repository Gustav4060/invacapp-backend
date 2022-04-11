package com.kruger.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.kruger.enumeration.EstadoVacunacionEnum;
import com.kruger.enumeration.TipoVacunaEnum;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 
 * @author Gustavo Parco
 *
 */
@Schema(description = "Empleado DATA")
public class EmpleadoDTO {

	private Long id;

	@Schema(description = "Cedula del empleado")
	@NotNull
	@Pattern(regexp = "[0-9]{10}")
	@Size(min = 10, max = 10, message = "Cedula debe tener 10 caracteres")
	private String cedula;

	@Schema(description = "nombres del empleado")
	@NotNull
	@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", message = "Nombre empleado solo caracteres")
	private String nombres;

	@Schema(description = "apellidos del empleado")
	@NotNull
	@Pattern(regexp = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", message = "Apellidos empleado solo caracteres")
	private String apellidos;

	@Schema(description = "correo del empleado")
	@Email(message = "Correo formato incorrecto")
	@NotNull
	private String correo;

	private LocalDate fechaNacimiento;

	private String direccion;

	private String telefono;

	private EstadoVacunacionEnum estadoVacunacion;

	private TipoVacunaEnum tipoVacuna;

	private LocalDate fechaVacunacion;

	private Integer numeroDosis;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public EstadoVacunacionEnum getEstadoVacunacion() {
		return estadoVacunacion;
	}

	public void setEstadoVacunacion(EstadoVacunacionEnum estadoVacunacion) {
		this.estadoVacunacion = estadoVacunacion;
	}

	public TipoVacunaEnum getTipoVacuna() {
		return tipoVacuna;
	}

	public void setTipoVacuna(TipoVacunaEnum tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}

	public LocalDate getFechaVacunacion() {
		return fechaVacunacion;
	}

	public void setFechaVacunacion(LocalDate fechaVacunacion) {
		this.fechaVacunacion = fechaVacunacion;
	}

	public Integer getNumeroDosis() {
		return numeroDosis;
	}

	public void setNumeroDosis(Integer numeroDosis) {
		this.numeroDosis = numeroDosis;
	}

}
