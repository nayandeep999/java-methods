package com.kodewala.strings;

public class SBExamples {
	public static void main(String[] args) {
		// 1) Create
		StringBuilder sb = new StringBuilder(); // default initial capacity = 16
		StringBuffer sBuf = new StringBuffer(32); // custom capacity = 32

		// 2) Append (method chaining)
		sb.append("Hello").append(' ').append("World").append("! ");
		sBuf.append("Start: ").append(123).append(" done.");

		// 3) Insert and delete
		sb.insert(6, "Beautiful "); // Hello Beautiful World!
		sb.delete(6, 16); // remove "Beautiful " -> back to Hello World!

		// 4) Replace
		sb.replace(6, 11, "Java"); // Hello Java!

		// 5) Reverse
		StringBuilder rev = new StringBuilder("abcd");
		rev.reverse(); // "dcba"

		// 6) Capacity and length
		System.out.println("sb: " + sb.toString());
		System.out.println("sb.length() = " + sb.length());
		System.out.println("sb.capacity() = " + sb.capacity());

		// 7) Ensure capacity & trim
		sb.ensureCapacity(1000); // forces internal array to be large enough
		sb.trimToSize(); // shrink internal array to current length

		// 8) toString() returns an immutable String
		String finalStr = sb.toString();

		System.out.println("finalStr = " + finalStr);
		System.out.println("sBuf = " + sBuf.toString());
	}
}
