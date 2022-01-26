package com.bridgelabz.demo;

import java.util.Scanner;

public class UserInterface {

	Scanner sc = new Scanner(System.in);

	public int showMainMenu() {
		System.out.println("Select \n 1.Add Contact");
		int choice = sc.nextInt();
		return choice;
	}

}
