package com.staticexample;

import static com.staticexample.CountNumber.getStaticCount;;

public class Main {

	public static void main(String[] args) {
		
//		static {
//			System.out.print("hello baolinh");
//		}
		
		CountNumber countNumber1 = new CountNumber();
		getStaticCount();
		// countNumber1.setCount(1);

		CountNumber countNumber2 = new CountNumber();
		getStaticCount();
		// countNumber2.setCount(2);

		CountNumber countNumber3 = new CountNumber();

		System.out.println(countNumber1.getCount() + "-------------" + countNumber2.getCount());

		System.out.print("static " + getStaticCount());
	}

}
