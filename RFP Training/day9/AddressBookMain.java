package com.bridgelabz.demo;

public class AddressBookMain {

	public void handleUserSelection() {
		ContactController contactController = new ContactController();
		UserInterface userInterface = new UserInterface();
		int x = 1;
		do {
			int choice = userInterface.showMainMenu();
			switch (choice) {
			case 1:
				contactController.addNewContact();
				break;
			case 2:
				contactController.editByName(ScannerUtil.getString("Enter contact name to edit"));
				break;
			}
			x = ScannerUtil.getInt("Do you want to continue...press 1");
		} while (x == 1);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBookMain main = new AddressBookMain();
		main.handleUserSelection();

	}

}
