package com.kodewala.strings;

public class DynamicEmailTemplate {

	StringBuilder genEmail(String _firstName, String _orderNum, String _date, int _amount, String _deliveryDate) {

		StringBuilder email = new StringBuilder();
		email.append("Dear ").append(_firstName).append(" Thankyou for placing order.")
				.append(" Your order details are: ").append(_orderNum).append(" ").append(_date).append(" ")
				.append(_amount).append(" ").append(_deliveryDate);

		return email;
	}

	public static void main(String[] args) {

		DynamicEmailTemplate orderEmail = new DynamicEmailTemplate();

		StringBuilder nayanEmail = orderEmail.genEmail("Nayan", "ORD12345", "2025-12-01", 450, "2025-12-10");

		System.out.println(nayanEmail);

		StringBuilder mohanEmail = orderEmail.genEmail("Mohan", "ORD12346", "2025-12-01", 480, "2025-12-10");

		System.out.println(mohanEmail);

	}

}
