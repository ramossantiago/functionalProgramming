package section7;

import java.util.function.Predicate;

import customClassesSkipLimitTakeDrop.Course;

public class HigherOrderFunctions {

	public static void main(String[] args) {
		
		int score1 = 95;
		int score2 = 90;
		
		Predicate<Course> reviewGreaterThan95Predicate = createPredicateByScore(score1);
		Predicate<Course> reviewGreaterThan90Predicate = createPredicateByScore(score2);
		
		
		
	}

	/**
	 * este es una Higher Order Function
	 * @param score
	 * @return
	 */
	private static Predicate<Course> createPredicateByScore(int score) {
		return course -> course.getScore() > score;
	}
	
}
