package com.kodewala.strings;

public class SbPractice2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for (int index = 0; index < 100; index++) {
			sb.append(index);
		}

		System.out.println(sb);
	}
}
