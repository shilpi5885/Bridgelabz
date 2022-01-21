/*Java Program to Check Whether a Number is Even or Odd*/
package com.bridgelabz.demo;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if (num % 2 == 0)
			System.out.println("Number is EVEN");
		else
			System.out.println("Number is ODD");
		s.close();
	}

}
