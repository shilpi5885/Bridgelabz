package com.bridgelabz.demo;

import java.util.Scanner;

public class UserInterface {

	Scanner sc = new Scanner(System.in);

	public int showMainMenu() {
		System.out.println("Select \n 1.Add Contact \n 2.Edit Contact \n 3.Delete Contact \n 4.Add Multiple Contacts\n 5.Add new Address Book");
		int choice = sc.nextInt();
		return choice;
	}
}
