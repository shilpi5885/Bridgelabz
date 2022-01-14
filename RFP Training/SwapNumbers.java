//Java Program to Swap Two Numbers

package com.bridgelabz.demo;

public class SwapNumbers {

	public static void main(String[] args) {
    	int firstNumber = Integer.parseInt(args[0]);
    	int secondNumber = Integer.parseInt(args[1]);
    	int thirdNumber = 0;
    	
    	System.out.println("Before Swapping: First Number ="+firstNumber+" Second Number ="+secondNumber);
    	
    	thirdNumber = firstNumber;
    	firstNumber = secondNumber;
    	secondNumber = thirdNumber;
    	
    	System.out.println("After Swapping: First Number ="+firstNumber+" Second Number ="+secondNumber);

	}

}
