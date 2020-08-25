import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<Student> students = new TreeSet<>();

		students.add(new Student(18, "linh"));
		students.add(new Student(19, "linh"));
		students.add(new Student(22, "ronaldo"));
		students.add(new Student(27, "amy men"));
		students.add(new Student(99, "god"));

		System.out.print(students);
	}
}
