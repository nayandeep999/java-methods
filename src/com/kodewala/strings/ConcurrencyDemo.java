package com.kodewala.strings;

public class ConcurrencyDemo {
	static final int ITER = 50000;

	public static void main(String[] args) throws InterruptedException {
		// Case 1: StringBuffer (synchronized) - result should be deterministic
		StringBuffer buffer = new StringBuffer();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < ITER; i++)
				buffer.append("a");
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < ITER; i++)
				buffer.append("b");
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("StringBuffer length: " + buffer.length() + " (expected " + (ITER * 2) + ")");

		// Case 2: StringBuilder (not synchronized) - likely race / inconsistent length
		StringBuilder builder = new StringBuilder();
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < ITER; i++)
				builder.append("a");
		});
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < ITER; i++)
				builder.append("b");
		});

		t3.start();
		t4.start();
		t3.join();
		t4.join();
		System.out.println("StringBuilder length: " + builder.length() + " (expected " + (ITER * 2) + ")");
	}
}
