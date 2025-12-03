package com.kodewala.strings;

public class ImmutableString {

	public static void main(String[] args) {
		String s1 = "Hello";
		s1.concat("World");
		System.out.println(s1); // creates a new object instead of modifying the original string
	}

}
