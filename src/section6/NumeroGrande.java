package section6;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumeroGrande {

	public static void main(String[] args) {
		
		/**
		 * Factorial, devuelve negativo porque es mas grende del rango de Integer 
		 */
		System.out.println(
				IntStream.range(1, 30).reduce(1, (x,y) -> x*y)
		);
		
		
		/**
		 * Factorial, devuelve negativo porque es mas grende del rango de Long 
		 */
		System.out.println(
				LongStream.range(1, 30).reduce(1, (x,y) -> x*y)
		);
		
		
		/**
		 * Factorial, hay que convertirlo en objeto Big Integer 
		 */
		System.out.println(
				LongStream.range(1, 30).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)
		);
		
	}
	
}
