package com.kodewala.strings;

class Mum {
	Mum(String _str) {
		System.out.println("Mum str is: " + _str);
	}
}

class Sumi extends Mum {
	protected Sumi(String _st) {
		super(_st);
	}
}

public class ParameterParentClass {

	public static void main(String[] args) {
		Sumi sums = new Sumi("hello");
	}
}
