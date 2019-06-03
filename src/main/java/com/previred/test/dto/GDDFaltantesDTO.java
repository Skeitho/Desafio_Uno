package com.previred.test.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GDDFaltantesDTO {

	private Long id;
	private Date fechaCreacion;
	private Date fechaFin;
	private List<Date> fechas = new ArrayList<Date>();
	private List<Date> fechasFaltantes = new ArrayList<Date>();
	
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	
	public GDDFaltantesDTO() {
		super();
	}
	public GDDFaltantesDTO(GDDDTO gddDTO) {
		super();
		
		this.id=gddDTO.getId();
		this.fechaCreacion=gddDTO.getFechaCreacion();
		this.fechaFin=gddDTO.getFechaFin();
		this.fechas=gddDTO.getFechas();
		
	}
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
	public List<Date> getFechasFaltantes() {
		return fechasFaltantes;
	}
	public void setFechasFaltantes(List<Date> fechasFaltantes) {
		this.fechasFaltantes = fechasFaltantes;
	}
	
	@Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("{\n");
	    
	    sb.append("    \"id\": ").append(toIndentedString(id)).append(",\n");
	    sb.append("    \"fechaCreacion\": ").append(toIndentedString(fechaCreacion)).append(",\n");
	    sb.append("    \"fechaFin\": ").append(toIndentedString(fechaFin)).append(",\n");
	    sb.append("    \"fechas\": ").append(toIndentedString(fechas)).append(",\n");
	    sb.append("    \"fechasFaltantes\": ").append(toIndentedString(fechasFaltantes)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }
	
	private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	    	return "null";
	    }
	     
	    if (o.getClass().equals(Date.class)) {
	    	
	    	return "\"" + formatter.format(o) + "\"".replace("\n", "\n    ");
	    	
	    }
	    
	    if (o.getClass().equals(ArrayList.class)) {
	    	
	    	ArrayList<Date> listFecha = (ArrayList) o;
	    	List listFechaF = new ArrayList<String>();
	    	String actual = null; 
	    	
	    	for (Date date:listFecha) {
	    		
	    		if (listFecha.get(listFecha.size()-1) != date)
	    			actual = formatter.format(date);
	    		else
	    			actual = formatter.format(date);
	    		
	    		
	    		actual.replace("\n", "\n    ");
	    		
	    		listFechaF.add("\"" + actual +"\"");
	    		
	    	}
	    	
	    	return listFechaF.toString().replace("\n", "\n    ");
	    	
	    }
	    
	    return o.toString().replace("\n", "\n    ");
	  }
	
	
	
}
