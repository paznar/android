import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Ejercicio {

	public static void main(String[] args) 
	{
		List<String> strings = new ArrayList();
		
		strings.add("a1");
		strings.add("a2");
		strings.add("b1");
		strings.add("b2");
		strings.add("c1");
		strings.add("c2");

		strings.stream()
			.filter(s -> s.startsWith("c"))
			.map(s -> s.toUpperCase())
			.sorted()
			.forEach(s -> System.out.println(s));
		
		// Otra manera de hacerlo, y con ordenación inversa.
		
		Comparator<String> normal = String::compareTo;
		Comparator<String> reversed = normal.reversed();
		
		Arrays.asList("a1", "a2", "b1", "b2", "c1", "c2").stream()
		.filter(s -> s.startsWith("c"))
		.map(s -> s.toUpperCase())
		.sorted(reversed)
		.forEach(s -> System.out.println(s));

	}

}
