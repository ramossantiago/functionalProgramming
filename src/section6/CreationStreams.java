package section6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationStreams {

	public static void main(String[] args) {

		System.out.println(
				Stream.of(1,2,4,5,7,9,7,5,4,4).count()
		);
		
		System.out.println(
				Stream.of(1,2,4,5,7,9,7,5,4,4).reduce(0, Integer::sum)
		);
	
		
		int[] arrayValues = {1,2,4,5,7,9,7,5,4,4};
		
		System.out.println(
				Arrays.stream(arrayValues).count()
		);
		
		System.out.println(
				Arrays.stream(arrayValues).sum()
		);
		
		System.out.println(
				Arrays.stream(arrayValues).max()
		);
		
		
		/**
		 * 
		 */
		
		System.out.println(
				IntStream.range(1, 10).sum()
		);
		
		System.out.println();
			IntStream.iterate(1, x -> x+2).limit(10).peek(System.out::println).sum();
		
		System.out.println(
				IntStream.iterate(2, x -> x*2).limit(10).boxed().collect(Collectors.toList())
		);
		
		
		
		
	}

}
