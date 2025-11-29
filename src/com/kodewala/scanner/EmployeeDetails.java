package com.kodewala.scanner;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		String name;
		int employeeId;
		int age;
		int salary;
		String address;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee name: ");
		name = sc.nextLine();

		while (true) {
			System.out.println("Enter employee id: ");
			if (sc.hasNextInt()) {
				employeeId = sc.nextInt();
				break;
			} else {
				System.out.println("Invalid, try again");
				sc.next();
			}
		}

		while (true) {
			System.out.println("Enter age: ");
			if (sc.hasNextInt()) {
				age = sc.nextInt();
				break;
			} else {
				System.out.println("Invalid, try again");
				sc.next();
			}
		}

		while (true) {
			System.out.println("Enter salary: ");
			if (sc.hasNextInt()) {
				salary = sc.nextInt();
				break;
			} else {
				System.out.println("Invalid, try again");
				sc.next();
			}
		}

		sc.nextLine(); // clearing the buffer

		System.out.println("Enter address: ");
		address = sc.nextLine();

		System.out.println(address);

		sc.close();
	}
}
