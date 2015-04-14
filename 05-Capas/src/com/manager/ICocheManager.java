package com.manager;

import java.util.List;

import com.modelo.Coche;

public interface ICocheManager 
{
	
	public Coche insertar(Coche coche);
	
	public List<Coche> listarTodos();
	
	public Coche mostrar (long id);
	
}
