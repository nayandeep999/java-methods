package com.kodewala.strings;

class Demo {

	// -------------------------
	// 1. INSTANCE VARIABLES (Heap)
	// -------------------------
	int instInt; // default = 0
	String instStr; // default = null
	boolean instBool; // default = false

	// -------------------------
	// 2. STATIC VARIABLES (Method Area)
	// -------------------------
	static int staticInt; // default = 0
	static String staticStr; // default = null
	static boolean staticBool; // default = false

	void showInstanceValues() {
		System.out.println("Instance int = " + instInt);
		System.out.println("Instance String = " + instStr);
		System.out.println("Instance boolean = " + instBool);
	}

	static void showStaticValues() {
		System.out.println("Static int = " + staticInt);
		System.out.println("Static String = " + staticStr);
		System.out.println("Static boolean = " + staticBool);
	}
}

public class DefaultLocalVal {

	public static void main(String[] args) {

		// -------------------------
		// 3. LOCAL VARIABLE (Stack)
		// -------------------------
		int localVar; // ❌ No default value

		// ❌ ERROR if you do this:
		// System.out.println(localVar);

		localVar = 50; // ✔ MUST initialize before use
		System.out.println("Local variable = " + localVar);

		// -------------------------
		// 4. ARRAY ELEMENTS (Heap)
		// -------------------------
		int[] nums = new int[3]; // default = 0
		String[] names = new String[3]; // default = null
		boolean[] flags = new boolean[3]; // default = false

		System.out.println("-----------------------------------");

		System.out.println("Array int element = " + nums[0]);
		System.out.println("Array String element = " + names[0]);
		System.out.println("Array boolean element = " + flags[0]);

		System.out.println("-----------------------------------");

		// -------------------------
		// Access Instance + Static variables
		// -------------------------
		Demo d = new Demo();
		d.showInstanceValues(); // prints defaults

		System.out.println("-----------------------------------");

		Demo.showStaticValues(); // prints defaults
	}
}
