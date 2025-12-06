package com.kodewala.switchh;

public class SwitchExp {

	static void switchCase(String _case) {

		String casse = _case;

		int foundCase = 0;

		switch (casse) {

		case "a":
			System.out.println("This is case a");
			foundCase = 1;
			break;

		case "b":
			System.out.println("This is case b");
			foundCase = 1;
			break;

//		default:
//			System.out.println("Invalid case"); //not mandetory
		}
		if (foundCase == 1) {
			System.out.println("Matched case found");
		} else
			System.out.println("Skipped switch stateement"); // skip switch if no matching case found
		System.out.println("After switch");
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		switchCase("a");
		switchCase("b");
		switchCase("x");

	}
}
