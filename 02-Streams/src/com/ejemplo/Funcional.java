package com.ejemplo;

import java.util.ArrayList;

public class Funcional {
	
	/*
		Lista de gastos de viaje diarios de un trabajador.
		La empresa se hará cargo de todos ellos, sí contando con el IVA el importe 
		no supera los 100 euros 
	*/
	public static void main(String[] args) {
		ArrayList<Gasto> lista= new ArrayList<>();
		 
		lista.add(new Gasto("A",80));
		lista.add(new Gasto("B",50));
		lista.add(new Gasto("C",70));
		lista.add(new Gasto("D",95));
		 
		double resultado=lista.stream()
		.mapToDouble(gasto->gasto.getValor()*1.21) //la variable gasto representa el contenido de la coleccion, en este caso partimos de un objeto Gasto y lo convertimos en uno Double 
		//.filter(gasto->gasto<100) //Aqui la variable gasto, es de tipo double.
		.sum();
		
		System.out.println(resultado); 
		//Sin aplicar el filtro el resultado seria de 356.95
		//Aplicando el filtro es de 242
	}
}
