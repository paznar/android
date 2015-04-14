package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.modelo.Coche;

public class CocheDao implements ICocheDao 
{

	@Override
	public Coche insertar(Coche coche) 
	{
		coche.setId(1);
		return coche;
	}

	@Override
	public List<Coche> listarTodos() 
	{
		List<Coche> coches = new ArrayList<>();
		
		coches.add(new Coche(2, "Opel", "GHK1234"));
		coches.add(new Coche(3, "Ford", "HFG1234"));
		
		return coches;
	}

	@Override
	public Coche mostrar(long id) 
	{
		Coche c = new Coche();

		if (id == 2) 
		{
			c = new Coche(2, "Opel", "GHK1234");
		} 
		else 
		{
			c = new Coche(3, "Ford", "HFG1234");
		}

		return c;
	}

}
