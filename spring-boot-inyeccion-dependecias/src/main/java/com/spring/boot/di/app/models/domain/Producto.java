package com.spring.boot.di.app.models.domain;

public class Producto {

	private String nombre;
	private Float precio;

	
	public Producto(String nombre, Float cantidad) {
		this.nombre = nombre;
		this.precio = cantidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Float getPrecio() {
		return precio;
	}


	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
}
