package com.kodewala.arrays;

class Customer {

	String name;
	int accNum;
	String email;
	int balance;

	Customer(String _name, int _accNum, String _email, int _balance) {

		this.name = _name;
		this.accNum = _accNum;
		this.email = _email;
		this.balance = _balance;

	}
}

public class HomeWork {

	public static void main(String[] args) {

		// Customer custArray[] = new Customer[5];

		// sequential read and random read // sequence is faster

		Customer[] custArray = { new Customer("Amit Verma", 1001, "amit.verma@example.com", 5000),
				new Customer("Sarla Kumari", 1002, "sarla.kumari@example.com", -1200),
				new Customer("Rohan Das", 1003, "rohan.das@example.com", 850),
				new Customer("Priya Sharma", 1004, "priya.sharma@example.com", -450),
				new Customer("Dev Mehta", 1005, "dev.mehta@example.com", 30000) };

		for (Customer element : custArray) {
			if (element.balance < 0) {
				System.out.printf(
						"%s your current balance is %d. Please maintain balance... Otherwise your account will get blocked in 10 days.%n",
						element.name, element.balance);
			}
		}

	}

}
