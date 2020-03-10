package b_functionalInterfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 3, 7, 8, 10, 12, 14, 9, 11, 14);

		/**
		 * predicates
		 */
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2 == 0;
			}
		};
		
		/**
		 * functions
		 */
		Function<Integer, Integer> squareFunction = x -> x*x;
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
		};
		
		/**
		 * Consumers
		 */
		Consumer<Integer> consumer = System.out::println;
		Consumer<Integer> consumer2 = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		
		numbers.stream()
		.filter(isEvenPredicate)
		.map(squareFunction)
		.forEach(consumer);
		
		System.out.println("");
		numbers.stream()
				.filter(isEvenPredicate2)
				.map(squareFunction2)
				.forEach(consumer2);
		
		
		// NUMERO MAYOR CON INTERFACE FUNCIONAL
		System.out.println("");
		
		BinaryOperator<Integer> maximunBinaryOperator = (x, y) -> x > y ? x : y;
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		BinaryOperator<Integer> maximunBinaryOperator2 = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer num1, Integer num2) {
				return num1 > num2 ? num1 : num2;
			}
		};
		
		System.out.println("Maximo: "+ numbers.stream().reduce(0, maximunBinaryOperator));
		System.out.println("Maximo 2: "+ numbers.stream().reduce(0, maximunBinaryOperator2));
		System.out.println("Suma: "+ numbers.stream().reduce(0, sumBinaryOperator));
	
		
		
		
	}

	
	
}
