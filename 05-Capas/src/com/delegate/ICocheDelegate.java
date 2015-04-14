package com.delegate;

import java.util.List;

import com.modelo.Coche;

public interface ICocheDelegate 
{
	public Coche insertar(Coche coche);
	
	public List<Coche> listarTodos();
	
	public Coche mostrar (long id);
}
