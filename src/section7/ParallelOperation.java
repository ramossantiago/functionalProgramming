package section7;

import java.util.stream.LongStream;

public class ParallelOperation {

	public static void main(String[] args) {
		
		
		long time = System.currentTimeMillis();
		
		LongStream.of(0, 1000000000).sum();
		
		System.out.println(System.currentTimeMillis() - time);
		
	}
}
