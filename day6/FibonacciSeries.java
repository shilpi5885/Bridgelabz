//Fibonacci Series

package com.bridgelabz.demo;

import java.util.Scanner;

class FibonacciSeries {
	public static void main(String args[]) {
		System.out.println("Enter the number of Fibbonacci series to be printed: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}
}
