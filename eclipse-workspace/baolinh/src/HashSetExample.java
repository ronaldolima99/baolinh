import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Student> students = new HashSet<Student>();

		students.add(new Student(18, "lima"));
		students.add(new Student(19, "linh"));
		students.add(new Student(22, "ronaldo"));
		students.add(new Student(19, "linh"));
		students.add(new Student(99, "god"));

		System.out.print(students);
	}

	// hashset ko xoa phan tu trung

}
