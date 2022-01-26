package com.bridgelabz.demo;

public class AddressBookMain {

	public void handleUserSelection(int choice) {
		ContactController contactController = new ContactController();
		switch (choice) {
		case 1:
			contactController.addNewContact();
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

	}

}
