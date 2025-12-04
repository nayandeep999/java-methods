package com.kodewala.strings;

public class CountSCPReferences {

	// Method that counts how many references point to the same SCP entry
	static int countSCP(String[] names, String... arr) {

		String scpRef = arr[0].intern(); // SCP reference
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == scpRef) {
				System.out.println(names[i] + " is pointing to the SAME SCP object");
				count++;
			} else {
				System.out.println(names[i] + " is NOT pointing to the SCP object");
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String a = "Java";
		String b = "Java";
		String c = new String("Java"); // separate heap object
		String d = new String("Java").intern(); // SCP

		String[] names = { "a", "b", "c", "d" };

		int duplicates = countSCP(names, a, b, c, d);

		System.out.println("\nTotal references to the same SCP object: " + duplicates);
	}
}
