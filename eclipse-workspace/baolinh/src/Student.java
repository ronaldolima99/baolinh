
public class Student implements Comparable<Student> {

	private int age;
	private String name;

	public Student() {

	}

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[ " + this.getName() + " : " + this.getAge() + " ]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student)
			return false;

		if (obj == this)
			return true;

		Student studentEx = (Student) obj;

		return this.name.equals(studentEx.name);
	}

}
