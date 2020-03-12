package excepciones;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class ManejoDeExcepciones {

	public static void main(String[] args) {

		/**
		 * Esta expresion lambda debe manejar las excepciones chequeadas, caso contrario tenemos errores de compilacion
		 */
//		Files.lines(Paths.get("URLS.txt"))
//		.map(str -> new URI(str))
//		.forEach(url -> imprimir(url.toString()));
		

		/**
		 * Esta expresion lambda usa interfaces funcionales que manejan las excepcines y lanzan excepciones no chequedads
		 * que deberian controlarse en la aplicacion principal 
		 */
		
		try {
			Files.lines(Paths.get("URLS.txt"))
				.map(FunctionWithExceptionManage.functionWithException(str -> new URL(str)))
				.forEach(ConsumerWithExceptionManage.consumerWithException(url -> imprimir(url.toString())));
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
			//System.out.println("CAUSE "+e.getCause().getClass());
			System.out.println("CLASS "+e.getClass().getName());
			//e.printStackTrace();
		}
	}
	
	
	public static void imprimir(String msg) throws CadenaVaciaException {
		if (Objects.isNull(msg) || msg.isEmpty()) {
			throw new CadenaVaciaException("String vacio");
		}
		System.out.println(msg);
	}
	
}
