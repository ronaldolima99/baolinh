package LinkedlistLession;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> listString = new LinkedList<String>();
		listString.add("java");
		listString.add("php");
		listString.add("c++");
		for (String obj : listString) {
			System.out.print("\n" + obj);
		}
	}

}
