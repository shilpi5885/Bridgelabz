/*Harmonic Number*/

package com.bridgelabz.demo;

import java.util.Scanner;

class HarmonicNumber {
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		double result = 0;
		for (; num > 0; num--) {
			System.out.println("1/" + num);
			result = result + (double) 1 / num;
		}
		System.out.print(result + ", ");
		s.close();
	}
}
