package com.pe.certus.model;

public class Producto {
	private Integer codigoProducto;
	private String nombre;
	private Double precio;
	
	
	
	public Producto() {
		super();
	}


	public Producto(Integer codigoProducto, String nombre, Double precio) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.precio = precio;
	}


	public Integer getCodigoProducto() {
		return codigoProducto;
	}


	public void setCodigoProducto(Integer codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
