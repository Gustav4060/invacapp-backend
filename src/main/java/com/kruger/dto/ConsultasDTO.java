package com.kruger.dto;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dto para consultas")
public class ConsultasDTO {
	
	@Schema(description = "campo necesario para la consulta estadoVacunacion")
	private String estadoVacunacion;
	@Schema(description = "campo necesario para la consulta tipoVacunacion")
	private String tipoVacunacion;
	@Schema(description = "campo necesario para la consulta fechaInicio")
	private LocalDate fechaInicio;
	@Schema(description = "campo necesario para la consulta fechaFin")
	private LocalDate fechaFin;
	public String getEstadoVacunacion() {
		return estadoVacunacion;
	}
	public String getTipoVacunacion() {
		return tipoVacunacion;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setEstadoVacunacion(String estadoVacunacion) {
		this.estadoVacunacion = estadoVacunacion;
	}
	public void setTipoVacunacion(String tipoVacunacion) {
		this.tipoVacunacion = tipoVacunacion;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	

}
