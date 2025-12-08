package com.kodewala.strings;

//class ObjectA{
//	int ab = 10;
//	void abc() {
//		System.out.println("This is abc");
//		void abcd() {
//			System.out.println("this is abcd");
//		}
//	}
//} Java does not support nested methods like js

public class ToString {

	public static void main(String[] args) {
		Integer num = 23;
		String nums = num.toString();
		System.out.println(nums);
		System.out.println(nums.getClass());
		System.out.println(nums.getClass().getName());
	}
}
