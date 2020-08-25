package com.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInteger {

	List<Integer> listInteger = new ArrayList<Integer>();

	public ListInteger() {

		listInteger.add(11);
		listInteger.add(90);
		listInteger.add(100);
		listInteger.add(54);
		listInteger.add(9);
		listInteger.add(42);
		listInteger.add(65);
		listInteger.add(12);
		listInteger.add(9);
		listInteger.add(94);
		listInteger.add(43);

	}

	public void sort() {
		for (int i = 0; i < listInteger.size() - 1; i++) {
			for (int j = i + 1; j < listInteger.size(); j++) {
				if (listInteger.get(i) > listInteger.get(j)) {
					int temp = listInteger.get(i);
					listInteger.set(i, listInteger.get(j));
					listInteger.set(j, temp);
				}
			}
		}

		System.out.print(listInteger);
	}

	public static void main(String[] args) {

		ListInteger obj = new ListInteger();
		obj.sort();

		Student student1 = new Student("linh", 25);
		Student student2 = new Student("lima", 44);
		Student student3 = new Student("will", 28);
		Student student4 = new Student("ronaldo", 19);

		List<Student> students = new ArrayList<Student>();
		students.add(student4);
		students.add(student2);
		students.add(student3);
		students.add(student1);

		Collections.sort(students);

		Collections.sort(students, new SortByName());
	}

}
