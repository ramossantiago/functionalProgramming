package exercises;

import java.util.List;

public class Excercises {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 3, 7, 8, 10, 12, 14, 9, 11, 14);
		
		numbers.stream().filter(x -> x % 2 == 0).reduce(0, (y, z) -> y > z ? z : y).forEach(System.out::println);
	
		// IMPRIMIR NUMEROS CON METHOD REFERENCES
		numbers.stream().forEach(System.out::println);
		
		
		// IMPRIMIR NUMEROS PARES CON METHOD REFERENCES
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		
	}
	
	
	
	
	
	
	
}
