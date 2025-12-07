package com.kodewala.strings;

public class ValueOfVsToString {

	public static void main(String[] args) {
		Object o = null;

		System.out.println(String.valueOf(o)); // prints "null"
		System.out.println(o.toString()); // NPE

	}

}
