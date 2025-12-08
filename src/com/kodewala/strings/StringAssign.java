package com.kodewala.strings;

public class StringAssign {

	public static void main(String[] args) {

		String s1 = "Kodewala ";
		// Stored in SCP. Immutable — cannot be changed.

		String s2 = s1.concat(" Academy"); // Interview
		// concat() creates a NEW object in the HEAP.
		// s1 still points to "Kodewala".
		// s2 points to "Kodewala Academy" (in heap).
		// Accademy also resides in SCP

		System.out.println(s1); // Kodewala
		System.out.println(s2); // Kodewala Academy

		String s3 = s1 + s2; // Interview
		// The + operator uses StringBuilder internally.
		// Creates:
		// 1. A StringBuilder object
		// 2. append(s1)
		// 3. append(s2)
		// 4. toString() → NEW String in HEAP
		// NOTE: This result is NOT placed in SCP.

		String s4 = new String(s1 + s2);
		// s1 + s2 → runtime → StringBuilder logic → creates 1 new String in HEAP
		// new String(...) creates ANOTHER object in HEAP
		// Total = 2 runtime objects (NOT 4)
		// (s1 and s2 already exist; we do NOT count them again)

		String s5 = "Hello" + " Kodewala"; // Interview
		// COMPILE-TIME constant folding.
		// Its a compile time optimization
		// Compiler converts this to: "Hello Kodewala"
		// Only ONE object created in SCP.

		String s6 = "Hello" + " Kodewala" + s1;
		// Because s1 is a variable → runtime concatenation.
		// Uses StringBuilder → creates a NEW String in HEAP.
		// NOT stored in SCP.

		// String s = "Hello " + obj;
		/*- String s = new StringBuilder()
		       .append("Hello ")
		       .append(String.valueOf(obj))
		       .toString();
		*/

		String s7 = new String("hello" + "kodewala");
		// "hello" + "kodewala" is a compile-time constant → "hellokodewala" placed in
		// SCP
		// new String(...) creates a NEW separate object in HEAP

		// Print all variables with their names
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("s5 = " + s5);
		System.out.println("s6 = " + s6);
	}
}
