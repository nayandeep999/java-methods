package com.kodewala.scanner;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		System.out.println("Enter any string");

		Scanner scan = new Scanner(System.in);

		String randomString = scan.next();

		System.out.println("The random string is: " + randomString);

		int price;

		while (true) {
			System.out.println("Please input integer");
			if (scan.hasNextInt()) {
				price = scan.nextInt();
				break;
			} else {
				System.out.println("invalid try again");
				scan.next(); // consuming the wrong input i.e. clearing the buffer
			}
		}

		scan.close();
	}

}
