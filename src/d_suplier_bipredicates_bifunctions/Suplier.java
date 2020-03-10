package d_suplier_bipredicates_bifunctions;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Suplier {

	
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 3, 7, 8, 10, 12, 14, 9, 11, 14);
		
		/**
		 * Suplier es cuando no envias parametros pero retornas algo, como el patron Factory
		 * @param args
		 */
		Supplier<Integer> randomIntegerSuplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		System.out.println("Random Supplier: "+randomIntegerSuplier.get());
		
		
		/**
		 * Unary Operator, recibe 1 parametro como input y envia 1 objeto de salida del mismo tipo
		 */
		System.out.println();
		UnaryOperator<Integer> unaryOperator = (x)-> x+10;
		System.out.println("Unary Operator: "+unaryOperator.apply(15));
		
		
		/**
		 * BiPredicate recibe 2 parametros de entrada, pueden ser de diferentes tipos y retorna un booleano
		 */
		System.out.println();
		BiPredicate<Integer, String> biPredicate = (number, str) -> {
			return number>10 && str.length() > 5;
		};
		System.out.println("BiPredicate: "+biPredicate.test(15, "sdfsdf"));
		System.out.println("BiPredicate 2: "+biPredicate.test(15, "sdf"));
		
		
		/**
		 * BiFunction recibe 2 parametros de entrada, pueden ser de diferentes tipos y retorna un valor de retorno
		 */
		System.out.println();
		BiFunction<Integer, String, Integer> biFunction = (number, str) ->{
			return number + str.length();
		};
		System.out.println("BiFunction: "+biFunction.apply(13, "sdfsdfsd"));
		
		
		/**
		 * BiConsumers recibe 2 parametros de entrada, pueden ser de diferentes tipos y NO retorna un valor de retorno
		 */
		System.out.println();
		BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		
		biConsumer.accept(145, "Cadena 2");
			
		
		
		
	}
	
}
