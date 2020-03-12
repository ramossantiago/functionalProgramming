package excepciones;

import java.util.function.Function;

@FunctionalInterface
public interface FunctionWithExceptionManage<E, S, Ex extends Throwable> {

	S apply(E e) throws Ex;
	
	
//	static <E, S, Ex extends Throwable> Function<E, S> crearUrl(FunctionWithExceptionManage<E, S, Ex> function) {
//
//		return f -> {
//			try {
//				return function.apply(f);
//			} catch (Throwable e) {
//				throw new RuntimeException(e);
//			}
//		};
//	}
	
	static <A, B, E extends Throwable> Function<A, B> functionWithException(FunctionWithExceptionManage<A, B, E> function) {

		return f -> {
			try {
				return function.apply(f);
			} catch (Throwable e) {
				throw new RuntimeException(e+" "+f.toString());
			}
		};
	}
	
}
