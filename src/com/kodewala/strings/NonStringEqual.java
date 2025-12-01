package com.kodewala.strings;

class PersonA { // extends String | cannot do because string class is final ,
				// cannot extend String class

}

public class NonStringEqual {

	public static void main(String[] args) {
		PersonA a = new PersonA();

		PersonA b = new PersonA();

		System.out.println(a.equals(b)); // false

		// In case of non string equals() method just compare the objects address or
		// reference

		// In case of string it compares the content
	}

}
