package com.kruger.dto;

import java.time.LocalDate;

import com.kruger.enumeration.EstadoVacunacionEnum;
import com.kruger.enumeration.TipoVacunaEnum;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dto para consultas")
public class ConsultasDTO {
	
	@Schema(description = "campo necesario para la consulta estadoVacunacion")
	private EstadoVacunacionEnum estadoVacunacion;
	@Schema(description = "campo necesario para la consulta tipoVacunacion")
	private TipoVacunaEnum tipoVacunacion;
	@Schema(description = "campo necesario para la consulta fechaInicio")
	private LocalDate fechaInicio;
	@Schema(description = "campo necesario para la consulta fechaFin")
	private LocalDate fechaFin;
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public EstadoVacunacionEnum getEstadoVacunacion() {
		return estadoVacunacion;
	}
	public TipoVacunaEnum getTipoVacunacion() {
		return tipoVacunacion;
	}
	public void setEstadoVacunacion(EstadoVacunacionEnum estadoVacunacion) {
		this.estadoVacunacion = estadoVacunacion;
	}
	public void setTipoVacunacion(TipoVacunaEnum tipoVacunacion) {
		this.tipoVacunacion = tipoVacunacion;
	}
	
	

}
