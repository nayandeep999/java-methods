package com.kodewala.strings;

public class ValidateFileName {

	public static void checkFileName(String _fileName) {

		String fileName = _fileName;
		boolean isValid = false;
		if (fileName.startsWith("IMG") && fileName.endsWith(".jpg"))
			isValid = true;
		if (isValid) {
			System.out.println("file name: " + fileName + " is valid.");
		} else {
			System.out.println("file name: " + fileName + " is not valid.");
		}

	}

	public static void main(String[] args) {

		checkFileName("IMG_GHGSNKXSKO2872.jpg");
		checkFileName("IMG_GHGSNKXSKO2872.pdf");
	}
}
