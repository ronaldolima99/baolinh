package com.staticexample;

public class CountNumber {
	public final static int finalStaticCount;

	public static int staticCount;

	private int count;

	static {
		System.out.print("no se chay truoc ham main");
	}

	static {
		finalStaticCount = 1;
		System.out.print("hello lima");
	}

	public CountNumber() {
		this.count++;
		this.staticCount++;
	}

	public static int increase() {

		return staticCount += 2;
	}

	public CountNumber(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static int getStaticCount() {
		return staticCount;
	}

	public static void setStaticCount(int staticCount) {
		CountNumber.staticCount = staticCount;
	}

	// mot method static chi su dung cho bien toan cuc la static

}
