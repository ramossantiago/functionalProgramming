package excepciones;

import java.util.function.Consumer;

@FunctionalInterface
public interface ConsumerWithExceptionManage<E, Ex extends Throwable> {

	void accept(E e) throws Ex;	
	
	static <E, Ex extends Throwable> Consumer<E> consumerWithException(ConsumerWithExceptionManage<E, Ex> consumer){
		
		return c -> {
			try {
				consumer.accept(c);
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		};
	}
	
	
}
