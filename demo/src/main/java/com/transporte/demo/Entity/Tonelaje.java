package com.transporte.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tonelaje {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTonelaje;
	private float capacidadTon;
	private  String descripcionTon;
	private float precioKmTon;
	public int getIdTonelaje() {
		return idTonelaje;
	}
	public void setIdTonelaje(int idTonelaje) {
		this.idTonelaje = idTonelaje;
	}
	public float getCapacidadTon() {
		return capacidadTon;
	}
	public void setCapacidadTon(float capacidadTon) {
		this.capacidadTon = capacidadTon;
	}
	public String getDescripcionTon() {
		return descripcionTon;
	}
	public void setDescripcionTon(String descripcionTon) {
		this.descripcionTon = descripcionTon;
	}
	public float getPrecioKmTon() {
		return precioKmTon;
	}
	public void setPrecioKmTon(float precioKmTon) {
		this.precioKmTon = precioKmTon;
	}
	
	
}
