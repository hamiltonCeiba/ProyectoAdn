package com.transporte.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conductor {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idConductor;
	
	private String cedulaCond;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private int celularCond;
	private boolean disponibleCond;
	
	
	
	
	public Conductor(String cedulaCond) {
		super();
		this.cedulaCond = cedulaCond;
	}
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
	public String getCedulaCond() {
		return cedulaCond;
	}
	public void setCedulaCond(String cedulaCond) {
		this.cedulaCond = cedulaCond;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public int getCelularCond() {
		return celularCond;
	}
	public void setCelularCond(int celularCond) {
		this.celularCond = celularCond;
	}
	public boolean isDisponibleCond() {
		return disponibleCond;
	}
	public void setDisponibleCond(boolean disponibleCond) {
		this.disponibleCond = disponibleCond;
	}
	
	
}
