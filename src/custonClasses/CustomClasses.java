package custonClasses;

import java.util.List;
import java.util.function.Predicate;

public class CustomClasses {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "tech", 52, 12),
				new Course("Oracle", "DBB", 95, 68),
				new Course("Hibernate", "ORM", 52, 23),
				new Course("Windows", "SO", 90, 54),
				new Course("Azure", "tech", 73, 18),
				new Course("Dockers", "tech", 52, 25),
				new Course("Java", "develop", 52, 25),
				new Course("Linux", "SO", 100, 233)
		);
		
		/**
		 * allMatch si todos cumplen con la condicion
		 */
		Predicate<Course> reviewGreaterThan95Predicate = course -> course.getScore() > 95;
		System.out.println("All > 90: "+ courses.stream().allMatch(reviewGreaterThan95Predicate));

		
		
		/**
		 * noneMatch 
		 */
		System.out.println();
		Predicate<Course> reviewLessThan50Predicate = course -> course.getScore() < 50;
		System.out.println("All < 50: "+ courses.stream().noneMatch(reviewLessThan50Predicate));
	
		
		/**
		 * anyMatch 
		 */
		System.out.println();
		Predicate<Course> reviewAnyGreaterThan90Predicate = course -> course.getScore() > 90;
		System.out.println("Any > 90: "+ courses.stream().anyMatch(reviewAnyGreaterThan90Predicate));
		
	}
	

}
