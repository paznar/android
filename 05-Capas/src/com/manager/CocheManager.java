package com.manager;

import java.util.List;

import com.dao.CocheDao;
import com.dao.ICocheDao;
import com.modelo.Coche;

public class CocheManager implements ICocheManager
{
	private ICocheDao cocheDao = new CocheDao();
	//private IClienteDAO clienteDao = new ClienteDao();
	
	public ICocheDao getCocheDao() 
	{
		return cocheDao;
	}

	public void setCocheDao(ICocheDao cocheDao) 
	{
		this.cocheDao = cocheDao;
	}

	@Override
	public Coche insertar(Coche coche) 
	{
		//getClienteDao().insertar(cliente);
		return getCocheDao().insertar(coche);
	}

	@Override
	public List<Coche> listarTodos() 
	{
		return getCocheDao().listarTodos();
	}

	@Override
	public Coche mostrar(long id) 
	{
		return getCocheDao().mostrar(id);
	}

}
