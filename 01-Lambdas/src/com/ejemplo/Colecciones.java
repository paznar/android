package com.ejemplo;

import java.util.Arrays;
import java.util.List;

public class Colecciones {

	public static void main(String[] args) {
		List<String> listaNombres = Arrays.asList("juan", "pedro", "maria", "Cristina");

		//p representa cada uno de los elementos del elemento iterable.
		listaNombres.forEach((String nombre) -> System.out.println(nombre));

	}
}
