package com.bridgelabz.demo;

import java.util.ArrayList;
import java.util.List;

public class ContactController {

	private List<Contact> contacts = new ArrayList<Contact>();

	public Contact addNewContact() {

		Contact contact = new Contact();
		Address address = new Address();

		contact.setFirstName(ScannerUtil.getString("Enter first name of the contact"));
		contact.setLastName(ScannerUtil.getString("Enter last name of the contact"));
		contact.setPhoneNumber(ScannerUtil.getLong("Enter phone number of the contact"));
		contact.setEmail(ScannerUtil.getString("Enter email of the contact"));

		address.setCity(ScannerUtil.getString("Enter city of the contact"));
		address.setState(ScannerUtil.getString("Enter state of the contact"));
		address.setZip(ScannerUtil.getInt("Enter zip code of the contact"));

		contact.setAddress(address);
		contacts.add(contact);
		return contact;

	}

	public void editByName(String name) {
		for (Contact contact : contacts) {
			if (name.equalsIgnoreCase(contact.firstName)) {
				editContact(contact, contact.getAddress());
			} else {
				System.out.println("Contact nor found");
			}
		}
	}

	public void editContact(Contact contact, Address address) {
		contact.setFirstName(ScannerUtil.getString("Enter new first name of the contact"));
		contact.setLastName(ScannerUtil.getString("Enter new last name of the contact"));
		contact.setPhoneNumber(ScannerUtil.getLong("Enter new phone number of the contact"));
		contact.setEmail(ScannerUtil.getString("Enter new email of the contact"));

		address.setCity(ScannerUtil.getString("Enter new city of the contact"));
		address.setState(ScannerUtil.getString("Enter new state of the contact"));
		address.setZip(ScannerUtil.getInt("Enter new zip code of the contact"));

		contact.setAddress(address);
	}

	public void deleteContact(String name) {
		for (Contact contact : contacts) {
			if (name.equals(contact.firstName)) {
				contacts.remove(contact);
				System.out.println("Contact removed successfully.");
				break;
			} else {
				System.out.println("Contact nor found");
			}
		}
	}
}
