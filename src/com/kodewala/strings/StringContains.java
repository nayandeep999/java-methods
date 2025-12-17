package com.kodewala.strings;

public class StringContains {

	public static void main(String[] args) {
		String s1 = "hello world";
		System.out.println(s1.contains("hello")); // true
		System.out.println(s1.contains("world")); // true
		System.out.println(s1.contains("hell")); // true
		System.out.println(s1.contains("hells")); // false
	}

}
