package com.kodewala.strings;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = "Kodewala";
		String s2 = new String("Kodewala");

		s2 = s2.intern(); // interning. copy the object from heap to scp if already in scp just point to
							// it

		System.out.println(s1 == s2); // true
	}
}
