//Reverse of a number

package com.bridgelabz.demo;

import java.util.Scanner;

public class ReverseOfNumber {
 
	public static void main(String[] args)   
	{  
	System.out.println("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	long number = sc.nextLong();
	long reverse = 0;  
	while(number != 0)   
	{  
	long remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);
	sc.close();
	}    
}
