package Individual;

import java.util.Scanner;

public class Employee {

	private String name;
	private int age;

	public Employee() {

	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your name : ");
		this.name = scan.nextLine();
		System.out.print("enter your age : ");
		this.age = scan.nextInt();

	}

	public String toString() {
		return "[ name : " + this.name + " age : " + this.age + "]";
	}
}
