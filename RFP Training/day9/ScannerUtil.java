package com.bridgelabz.demo;

import java.util.Scanner;

public class ScannerUtil {

	private final static Scanner SCANNER = new Scanner(System.in);

	public static String getString(String message) {
		System.out.println(message);
		return SCANNER.next();
	}

	public static int getInt(String message) {
		System.out.println(message);
		return SCANNER.nextInt();
	}

	public static Long getLong(String message) {
		System.out.println(message);
		return SCANNER.nextLong();
	}
}
