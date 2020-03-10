package section8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class WorkingWithFiles {

	public static void main(String[] args) throws IOException {
		
		Files.lines(Paths.get("File.txt"))
		.map(str -> str.split(" "))
		.flatMap(x-> Arrays.stream(x))
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		Files.list(Paths.get("."))
			.filter(Files::isDirectory)
			.forEach(System.out::println);
	}
	
}
