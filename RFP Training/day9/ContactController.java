package com.bridgelabz.demo;

public class ContactController {
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

		return contact;

	}

}
