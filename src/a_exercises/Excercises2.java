package a_exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Excercises2 {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 3, 7, 8, 10, 12, 14, 9, 11, 14);

		
		// SUMATORIA DE LOS CUADRADOS
		System.out.println(numbers.stream().map(x -> x*x).reduce(0, Integer::sum));	
		
		// IMPRIMIR LOS DIFERENTES
		System.out.println("");
		numbers.stream().distinct().forEach(System.out::println);
		
		
		// IMPRIMIR LOS DIFERENTES ordenados
		System.out.println("");
		numbers.stream().distinct().sorted().forEach(System.out::println);
		
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Angular", "BDD", "Azure", "SQL", "Oracle", "MySQL", "Kubernetes");
		
		// IMPRIMIR EN ORDEN NATURAL
		System.out.println("");
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		
		// IMPRIMIR EN ORDEN NATURAL INVERSO
		System.out.println("");
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		
		
		// HACER UNA COPIA DE LA LISTA PERO DE VALORES CUADRADOS
		System.out.println("");
		List<Integer> cuadrados = numbers.stream().map(number -> number * number).collect(Collectors.toList());
		cuadrados.stream().forEach(System.out::println);
		
		/**
		 * LOS METODOS QUE RETORNAN UN Stream() SE LLAMAN OPERACIONES INTERMEDIAS
		 * 
		 * .stream()
		 * .filter()
		 * .map()
		 * .sorted()
		 *  
		 */
		
		/**
		 * LOS METODOS CON LOS QUE FINALIZAN LAS EXPRESIONES SE LLAMAN OPERACIONES TERMINALES
		 * ESTAS RETORNAN OTRA COSA DIFERENTE A UN STREAM
		 * 
		 * .forEach()
		 * .collect
		 * .reduce()
		 */
		
	}

	
	
}
