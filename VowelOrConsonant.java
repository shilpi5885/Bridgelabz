/*Java Program to Check Whether an Alphabet is Vowel or Consonant*/

package com.bridgelabz.demo;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
        System.out.print("Enter an albhabet : ");
        Scanner s = new Scanner(System.in);
        char letter = s.next().charAt(0);
        switch(letter) {
        
        case 'a': 
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
        	System.out.println("Given alphabet is a VOWEL");
        	break;
        default:
        	System.out.println("Given alphabet is a CONSONANT");        	
        }
        s.close();
	}

}
