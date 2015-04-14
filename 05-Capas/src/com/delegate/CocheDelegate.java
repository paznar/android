package com.delegate;

import java.util.List;

import com.manager.CocheManager;
import com.manager.ICocheManager;
import com.modelo.Coche;

public class CocheDelegate implements ICocheDelegate
{
	private ICocheManager cocheManager = new CocheManager();

	public ICocheManager getCocheManager() 
	{
		return cocheManager;
	}

	public void setCocheManager(ICocheManager cocheManager) 
	{
		this.cocheManager = cocheManager;
	}

	@Override
	public Coche insertar(Coche coche) 
	{
		//Llamada a servicio externo pasando matrícula, setea marca
		if(true)
		{
			coche = getCocheManager().insertar(coche);
		}
		else
		{
			System.out.println("Fallo del servicio externo");
		}
		
		return coche;
	}

	@Override
	public List<Coche> listarTodos() 
	{
		return getCocheManager().listarTodos();
	}

	@Override
	public Coche mostrar(long id) 
	{
		return getCocheManager().mostrar(id);
	}

}
