package com.ejemplo;

public interface Math {
	int add(int a, int b);

	// Aunque también podriamos haber puesto un metodo estático (static)
	default int multiply(int a, int b) {
		return a * b;
	}
}
