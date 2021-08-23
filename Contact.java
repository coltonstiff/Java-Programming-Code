// Colton Stiff
// 2021-07-18
// SNHU
// CS-320: 3-2 Milestone: Contact Service

package contact;

// Contact class members
public class Contact {
	String contactID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;

// Constructor
public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
	super();
	this.contactID = contactID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.address = address;
}

// Get ContactID
public String getContactID() {
	return contactID;
}

// Set ContactID
public void setContactID(String contactID) {
	this.contactID = contactID;
}

// Get firstName
public String getFirstName() {
	return firstName;
}

// Set firstName
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

// Get lastName
public String getLastName() {
	return lastName;
}

// Set lastName
public void setLastName(String lastName) {
	this.lastName = lastName;
}

// Get PhoneNumber
public String getPhoneNumber() {
	return phoneNumber;
}

// Set PhoneNumber
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

// Get Address
public String getAddress() {
	return address;
}

// Set Address
public void setAddress(String address) {
	this.address = address;
}

// Verify if the contacts are unique/not unique
@Override

public String toString() {
	return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}