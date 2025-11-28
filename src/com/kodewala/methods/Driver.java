package com.kodewala.methods;

public class Driver {

	void checkAgeForDrivingLicense(int _age) {

		if (_age >= 18) {
			System.out.println("You are eligible for driving license");
		} else
			System.out.println("You are not eligible for driving license");
		;

	}

	public static void main(String[] args) {

		Driver dr = new Driver();

		dr.checkAgeForDrivingLicense(17);

	}
}