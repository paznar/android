package com.ejemplo;

public interface Math {
	int add(int a, int b);

	// Aunque tambi�n podriamos haber puesto un metodo est�tico (static)
	default int multiply(int a, int b) {
		return a * b;
	}
}
