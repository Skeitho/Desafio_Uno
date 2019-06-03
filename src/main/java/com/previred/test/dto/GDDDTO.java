package com.previred.test.dto;

import java.util.Date;
import java.util.List;

public class GDDDTO {

	private Long id;
	private Date fechaCreacion;
	private Date fechaFin;
	private List<Date> fechas;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public List<Date> getFechas() {
		return fechas;
	}
	public void setFechas(List<Date> fechas) {
		this.fechas = fechas;
	}
	
	
	
}
