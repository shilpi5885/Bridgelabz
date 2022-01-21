/*Java program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.*/

package com.bridgelabz.demo;

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		int n = Integer.parseInt(args[0]);
		int powerOfTwo = 1;

		for (int i = 0; i <= n; i++) {
			System.out.println("2 to the power " + i + " is " + powerOfTwo);

			powerOfTwo = 2 * powerOfTwo;

		}

	}

}