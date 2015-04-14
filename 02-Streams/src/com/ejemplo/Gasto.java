package com.ejemplo;

public class Gasto {

	private String descripcion;
	private int valor;

	public Gasto(String descripcion, int valor) {
		this.descripcion = descripcion;
		this.valor = valor;
	}

	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
}
