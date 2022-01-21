/*Flip Coin and print percentage of Heads and Tails*/

package com.bridgelabz.demo;

public class FlipCoin {
	public static void main(String[] args) {
		int count = 10;
		int countTail = 0;
		int countHead = 0;
		int headPercentage = 1;
		int tailPercentage = 1;
		for (int i = 0; i < count; i++) {
			int r = (int) (10 * Math.random());
			System.out.println(r);
			if (r > 5) {
				System.out.println("Head");
				countHead++;
			} else {
				System.out.println("Tail");
				countTail++;
			}
		}
		System.out.println(countHead);
		System.out.println(countTail);

		headPercentage = countHead * 10;
		tailPercentage = countTail * 10;
		System.out.println("Heads Percentage = " + headPercentage);
		System.out.println("Tails Percentage = " + tailPercentage);
	}
}
