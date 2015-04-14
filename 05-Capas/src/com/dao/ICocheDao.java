package com.dao;

import java.util.List;

import com.modelo.Coche;

public interface ICocheDao {
	
	public Coche insertar(Coche coche);
	
	public List<Coche> listarTodos();
	
	public Coche mostrar (long id);
	
}
