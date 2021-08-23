// Colton Stiff
// 2021-07-18
// SNHU
// CS-320: 3-2 Milestone: Contact Service

package contact;

import java.util.ArrayList;

public class ContactService {  

// Holds contact list
private ArrayList<Contact> contacts;

// Add, remove, update contact function
public ContactService() {
	contacts = new ArrayList<>();
}
// Add contact
public boolean addContact(Contact contact){
boolean contactAlready= false;
	
	// Verify if contact exists in contact list
	for (Contact contactList:contacts) {
		if (contactList.equals(contact)) {
			contactAlready = true;
			}
		}
		if (!contactAlready) {
			contacts.add(contact);
		return true;
		}
		else
		{
		return false;
	}
}

// Delete contact 
public boolean deleteContact(String contactID) {
	
	// Verify if contact exists in contact list to delete
	for (Contact contactList:contacts) {
		if (contactList.getContactID().equals(contactID)) {
			contacts.remove(contactList);
		return true;
	}
}
	return false;
}
  
// Update contact
public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
	
	// Veify if contact exists in contact list to update
	for (Contact contactList:contacts) {
		
		// If contactID exists in list perform update
		if (contactList.getContactID().equals(contactID)) {
		if(!firstName.equals("") && !(firstName.length()>10)) {
			contactList.setFirstName(firstName);
		}
		if(!lastName.equals("") && !(lastName.length()>10)) {
			contactList.setFirstName(lastName);
		}
		if(!phoneNumber.equals("") && (phoneNumber.length()==10)) {
			contactList.setFirstName(phoneNumber);
		}
		if(!address.equals("") && !(address.length()>30)) {
			contactList.setFirstName(address);
		}
		return true;
	}
}

	return false;
	}
}