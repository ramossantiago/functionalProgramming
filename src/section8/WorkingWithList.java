package section8;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "xcvxc" ,"Spring Boot", "API", "Angular", "BDD", "Azure", "SQL", "Oracle", "MySQL", "Kubernetes");
		
		List<String> modificar = new ArrayList<String>(courses);
		
	
		modificar.replaceAll(String::toUpperCase);
		System.out.println(modificar);
		
		modificar.removeIf(x -> x.length() < 6);
		System.out.println(modificar);
	}
	
}
