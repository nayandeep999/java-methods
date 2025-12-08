package com.kodewala.strings;

public class StringExp {

	// scp does not contains duplicate object with same contents

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s2 = "hello";

		String s3 = new String("hello");

		System.out.println(s1 == s2); // false different location / have diff memory address
		System.out.println(s2.equals(s3)); // equals just compare the content does not check memory address

		// Total three objects s1, s2, s3

		String s4 = new String("Kodewala");
		String s5 = new String("Academy");
		String s6 = new String("Kodewala");

		// In case of non string equals() method just compare the objects address or
		// refrence

		// Total 4 objects s4, s5, s6, "Kodewala" , "Academy"

	}

}
