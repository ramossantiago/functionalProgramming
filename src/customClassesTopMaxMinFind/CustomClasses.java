package customClassesTopMaxMinFind;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import customClassesSkipLimitTakeDrop.Course;

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
				new Course("Linux", "SO", 980, 233)
		);
		
		Comparator<Course> comparatorByNoStudentsIncrAndScore = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getScore);
		Predicate<Course> reviewScoreEquals100Predicate = course -> course.getScore() == 100;
		
		System.out.println(courses.stream()
				.sorted(comparatorByNoStudentsIncrAndScore)
				.collect(Collectors.toList()));
		
		/**
		 * Encontrar el maximo de acuerdo al comparador, max retorna el ultimo elemento de la lista
		 */
		System.out.println();
		System.out.println("MAX: "+courses.stream()
				.max(comparatorByNoStudentsIncrAndScore));
		
		
		/**
		 * Encontrar el minimo de acuerdo al comparador, max retorna el primer elemento de la lista
		 */
		System.out.println();
		System.out.println("MIN: "+courses.stream()
				.min(comparatorByNoStudentsIncrAndScore));
		
		
		/**
		 * Retornar un valor defecto
		 */
		System.out.println();
		System.out.println("== 100: "+courses.stream()
				.filter(reviewScoreEquals100Predicate)
				.min(comparatorByNoStudentsIncrAndScore)
				//.orElseThrow()
				.orElse(new Course("Dummy Course", "", 0, 0))
				);
		
		
		
		/**
		 * Buscar el primero
		 */
		System.out.println();
		System.out.println("First: "+courses.stream()
				.findFirst()
		);
		
		
		/**
		 * Buscar cualquiera
		 */
		System.out.println();
		System.out.println("Any: "+courses.stream()
				.findAny()
		);
		
		
		/**
		 * Contar el total de estudiantes
		 */
		System.out.println();
		System.out.println("Sum of students: "+courses.stream()
				.mapToInt(Course::getNoOfStudents)
				.sum()
		);
		
		
		/**
		 * Contar el total de estudiantes
		 */
		System.out.println();
		System.out.println("Sum of students 2: "+(courses.stream()
				.map(Course::getNoOfStudents))
				.reduce(0, Integer::sum)
		);
		
		
		/**
		 * Contar el total de estudiantes
		 */
		System.out.println();
		System.out.println("Avg of students: "+(courses.stream()
				.mapToInt(Course::getNoOfStudents))
				.average()
		);
		
		
		/**
		 * Contar el total de cursos
		 */
		System.out.println();
		System.out.println("Avg of students: "+(courses.stream()
				.mapToInt(Course::getNoOfStudents))
				.count()
		);
		
		
		/**
		 * Maximo de estudiantes en un curso
		 */
		System.out.println();
		System.out.println("Max of students: "+(courses.stream()
				.mapToInt(Course::getNoOfStudents))
				.max()
		);
		
		
		/**
		 * Minimo de estudiantes en un curso
		 */
		System.out.println();
		System.out.println("Max of students: "+(courses.stream()
				.mapToInt(Course::getNoOfStudents))
				.min()
		);
	}

}
