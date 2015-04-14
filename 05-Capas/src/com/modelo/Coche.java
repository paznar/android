package com.modelo;

public class Coche {

	private long id;
	private String marca;
	private String matricula;


	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Coche(long id, String marca, String matricula) {
		super();
		this.id = id;
		this.marca = marca;
		this.matricula = matricula;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", matricula="
				+ matricula + "]";
	}
		
}
