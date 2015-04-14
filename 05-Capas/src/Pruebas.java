import java.util.Iterator;
import java.util.List;

import com.delegate.CocheDelegate;
import com.delegate.ICocheDelegate;
import com.modelo.Coche;


public class Pruebas 
{

	public static void main(String[] args) 
	{
		ICocheDelegate cocheDelegate = new CocheDelegate();
		
		Coche coche = cocheDelegate.insertar(new Coche(0, "Seat", "ABC1234"));
		
	    System.out.println(coche);
	    
	    List<Coche> coches = cocheDelegate.listarTodos();
	    
	    for (Iterator<Coche> iterator = coches.iterator(); iterator.hasNext();)
	    {
			Coche cocheAux = (Coche) iterator.next();
			System.out.println(cocheAux);
		}
	}
	
}
