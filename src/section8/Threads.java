package section8;

import java.util.stream.IntStream;

public class Threads {

	public static void main(String[] args) {
		
		/**
		 * structured way
		 */
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for (int i=0 ; i <1000 ; i++) {
					System.out.println(Thread.currentThread().getId()+" :"+i);
				}
			}
		}; 
		
		
//		Thread t1 = new Thread(runnable);
//		t1.start();
//		
//		Thread t2 = new Thread(runnable);
//		t2.start();
//		
//		Thread t3 = new Thread(runnable);
//		t3.start();
		
		
		Runnable runnable2 = () -> {
			IntStream.rangeClosed(0, 1000).forEach(i -> System.out.println(Thread.currentThread().getId()+ ": "+i)); 
		};
		
		
		Thread t1 = new Thread(runnable2);
		t1.start();
		
		Thread t2 = new Thread(runnable2);
		t2.start();
		
		Thread t3 = new Thread(runnable2);
		t3.start();
		
	}
	
}
