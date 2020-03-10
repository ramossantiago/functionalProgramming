package methodRefernces;

import java.util.List;
import java.util.function.Supplier;

public class MethodRefernces {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Angular", "BDD", "Azure", "SQL", "Oracle",
				"MySQL", "Kubernetes");

		courses.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);

		//Supplier<String> supplier = () -> new String();
		Supplier<String> supplier = String::new;
		
		
	}

}
