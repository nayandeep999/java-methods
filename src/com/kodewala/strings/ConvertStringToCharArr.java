package com.kodewala.strings;

public class ConvertStringToCharArr {

	public static void main(String[] args) {
		int vowelCount = 0;
		String s1 = "hello";

		// Convert string to character array
		char[] arr = s1.toCharArray();

		for (char c : arr) {
			// 1. Use '==' for primitive char comparison
			// 2. Use single quotes '' for chars (double quotes "" are for Strings)
			// 3. Use '||' (OR) to check multiple conditions
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
			}
		}

		System.out.println("Total vowels: " + vowelCount);
	}
}