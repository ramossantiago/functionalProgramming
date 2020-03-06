package exercises;

import java.util.List;

public class Excercises {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 3, 7, 8, 10, 12, 14, 9, 11, 14);
		
		// IMPRIMIR NUMEROS CON METHOD REFERENCES
		numbers.stream().forEach(System.out::println);
		
		
		// IMPRIMIR NUMEROS PARES CON METHOD REFERENCES
		System.out.println(" ");
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		
		
		// BUSCAR EL NUMERO MAYOR DE LA LISTA
		System.out.println(" ");
		System.out.println("Numero mayor: "+ numbers.stream().reduce(0, (x, y) -> x > y ? x : y));
		
		System.out.println(" ");
		System.out.println("Numero mayor 2:  "+ numbers.stream().reduce(0, (x, y) -> { 
			return x > y ? x : y; 
		})
		);

		
		// IMPRIMIR LA SUMATORIA DE LA LISTA
		System.out.println(" ");
		System.out.println("Sumatoria: "+ numbers.stream().reduce(0, (x, y) -> x + y));
		
		
		// IMPRIMIR LA LISTA DE CUADRADOS DE CADA ELEMENTO
		System.out.println(" ");
		System.out.println("Cuadrados");
		numbers.stream().map(number -> number * number).forEach(System.out::println);
		
		
	}
	
	
	
	
	
	
	
}
