package section7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OtherOperations {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Angular", "BDD", "Azure", "SQL", "Oracle", "MySQL", "Kubernetes");
		
		/***
		 * Imprimir los nombres concatenados con ,
		 */
		
		System.out.println(
				courses.stream().collect(Collectors.joining(", "))
		);
		
		
		/***
		 * Dividir los nombres concatenados
		 */
		
		System.out.println(
				courses.stream().map(course -> course.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList()) 
		);
		
		List<String> courses2 = List.of("Spring2", "Spring Boot2", "API2", "Angular2", "BDD2", "Azure2", "SQL2", "Oracle2", "MySQL2", "Kubernetes2");
		
		
		/**
		 * en este caso por cada course se genera una lista, y el resultado final es una lista de listas que se estan filtrando por las diferentes 
		 */
		System.out.println(
				courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course, course2)))
				.filter(list -> !list.get(0).equals(list.get(1)))
				.collect(Collectors.toList())
				);
		
		
		
		
		
	}

}
