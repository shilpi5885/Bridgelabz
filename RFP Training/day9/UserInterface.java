package com.bridgelabz.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

	Scanner sc = new Scanner(System.in);

	public int showMainMenu() {
		System.out.println("Select \n 1.Add Contact 2.Edit Contact");
		int choice = sc.nextInt();
		return choice;
	}

	public void print(ArrayList<Contact> contacts) {
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
}
