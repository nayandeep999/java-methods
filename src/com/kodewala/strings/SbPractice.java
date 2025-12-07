package com.kodewala.strings;

public class SbPractice {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder(); // initial capacity is 16
		System.out.println(sb);
		System.out.println("The length is: " + sb.length());
		System.out.println("The capacity is: " + sb.capacity()); // length + capacity
		System.out.println("-------------------------------------------------------");

		System.out.println("Appending()");
		sb.append("12345678911234567");
		System.out.println(sb);
		System.out.println("The length is: " + sb.length());
		System.out.println("The capacity is: " + sb.capacity()); // appending doesn't increase capacity unless you cross
																	// the capacity, then capacity = capacity * 2 + 2;
		System.out.println("-------------------------------------------------------");

		System.out.println("Insert() & Delete()");
		sb.insert(5, "X"); // On 5th index (starts from zero)
		System.out.println(sb);
		sb.delete(5, 7);
		System.out.println(sb);
		System.out.println("-------------------------------------------------------");

		System.out.println("Replace()");
		sb.replace(5, 5, " ");
		System.out.println(sb);
		System.out.println("-------------------------------------------------------");

		System.out.println("Reverse()");
		sb.reverse();
		System.out.println(sb);
		System.out.println("-------------------------------------------------------");

		System.out.println("Ensure capacity & trim to size");
		sb.ensureCapacity(1000);
		System.out.println("The capacity is: " + sb.capacity());
		sb.trimToSize();
		System.out.println(sb);
		System.out.println("The capacity is: " + sb.capacity());
	}
}
