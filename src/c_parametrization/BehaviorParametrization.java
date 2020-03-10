package c_parametrization;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviorParametrization {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 3, 7, 8, 10, 12, 14, 9, 11, 14);

		Function<Integer, Integer> squareFunction = x -> x*x;
		Function<Integer, Integer> cubeFunction = x -> x*x*x;
		
		
		
		FilterAndPrint(numbers, x -> x%2 == 0);
		System.out.println("");
		FilterAndPrint(numbers, x -> x%2 != 0);
		System.out.println("");
		FilterAndPrint(numbers, x -> x%3 == 0);
		
		System.out.println("");
		List<Integer> squareList = mapNewList(numbers, squareFunction);
		System.out.println("Square List: "+squareList);
		
		System.out.println("");
		List<Integer> cubeList = mapNewList(numbers, cubeFunction);
		System.out.println("Cube List: "+cubeList);
	}

	private static List<Integer> mapNewList(List<Integer> numbers, Function<Integer, Integer> mapper) {
		List<Integer> squareList = numbers.stream()
				.map(mapper)
				.collect(Collectors.toList());
		return squareList;
	}

	private static void FilterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
			.filter(predicate)
			.forEach(System.out::println);
	}

	
	
}
