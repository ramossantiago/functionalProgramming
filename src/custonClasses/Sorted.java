package custonClasses;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		
		List<Course> courses = List.of(
				new Course("Spring", "tech", 52, 12),
				new Course("Oracle", "DBB", 95, 68),
				new Course("Hibernate", "ORM", 52, 23),
				new Course("Windows", "SO", 90, 54),
				new Course("Azure", "tech", 73, 18),
				new Course("Dockers", "tech", 32, 25),
				new Course("Java", "develop", 53, 25),
				new Course("Linux", "SO", 100, 233)
		);
		
		Comparator<Course> comparatorByNoStudentsIncr = Comparator.comparing(Course::getNoOfStudents);
		System.out.println(courses.stream()
				.sorted(comparatorByNoStudentsIncr)
				.collect(Collectors.toList()));

		
		Comparator<Course> comparatorByNoStudentsDecr = Comparator.comparing(Course::getNoOfStudents).reversed();
		System.out.println(courses.stream()
				.sorted(comparatorByNoStudentsDecr)
				.collect(Collectors.toList()));
		
		
		Comparator<Course> comparatorByNoStudentsIncrAndScore = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getScore);
		System.out.println(courses.stream()
				.sorted(comparatorByNoStudentsIncrAndScore)
				.collect(Collectors.toList()));
		
		
		/**
		 * top five courses
		 */
		System.out.println(courses.stream()
				.sorted(comparatorByNoStudentsIncrAndScore)
				.limit(5)
				.collect(Collectors.toList()));
		
		
		/**
		 * skip, elimina los primeros resultados de la lista 
		 */
		System.out.println(courses.stream()
				.sorted(comparatorByNoStudentsIncrAndScore)
				.skip(3)
				.collect(Collectors.toList()));
		
		
		/**
		 * takeWhile, recupera los valores hasta que el siguiente elemento NO pasa la prueba 
		 */
		System.out.println(courses.stream()
				.takeWhile(course -> course.getScore() > 50 )
				.collect(Collectors.toList()));
		
		
		/**
		 * dropWhile, borra los valores hasta que el siguiente elemento NO pasa la prueba 
		 */
		System.out.println(courses.stream()
				.dropWhile(course -> course.getScore() > 50 )
				.collect(Collectors.toList()));
		
	}
	
}
