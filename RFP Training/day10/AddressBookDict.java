package com.bridgelabz.demo;

import java.util.Hashtable;
import java.util.List;

public class AddressBookDict {

	public Hashtable<String, List<Contact>> addAddressBook(String name, List<Contact> addressBook) {
		Hashtable<String, List<Contact>> addressBookDict = new Hashtable<String, List<Contact>>();
		ContactController contactController = new ContactController();
		String  opt = "a";
		do {
			addressBookDict.put(name, contactController.addNewContact());
			opt  = ScannerUtil.getString("Press a to add more Address books");
		} while (opt.equalsIgnoreCase("A"));
		return addressBookDict;
	}
}