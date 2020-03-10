package customClassesGrouping;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import customClassesSkipLimitTakeDrop.Course;

public class Grouping {

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
		
		
		/**
		 * agrupar por categoria, esta funcion de agrupacion agrupa el objeto completo
		 */
		System.out.println("GRUPOS: "+
		courses.stream()
			.collect(Collectors.groupingBy(Course::getCategory))
		);
		

		
		/**
		 * contar cursos por categoria
		 */
		System.out.println("CONTAR GRUPO: "+
		courses.stream()
			.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))
		);
		
		
		
		/**
		 * contar cursos por categoria
		 */
		System.out.println("MOSTRAR MAX EST POR GRUPO: "+
		courses.stream()
			.collect(Collectors.groupingBy(Course::getCategory, 
					Collectors.maxBy(Comparator.comparing(Course::getNoOfStudents))))
		);

		
		/**
		 * agrupar por categoria muestra solo nombres, esta funcion de agrupacion agrupa solo el nombre del curso
		 */
		System.out.println("GRUPOS SOLO NOMBRE: "+
		courses.stream()
			.collect(Collectors.groupingBy(Course::getCategory, 
					Collectors.mapping(Course::getName, Collectors.toList())))
		);

		
		
		

	}

}
