// Colton Stiff
// 2021-07-18
// SNHU
// CS-320: 3-2 Milestone: Contact Service

package contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Make object class member to be accesed by all methods 
public class ContactTest {
    Contact contact = new Contact("1", "firstName", "lastName", "123456789", "fake street 2101"); 

	// Test getContactID
    @Test
    public void getContactID() {
        assertEquals("1", contact.getContactID());
    }
	
	// Test getFirstName
    @Test
    public void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }
	
	// Test getLastName
    @Test
    public void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }
	
	// Test getPhoneNumber
    @Test
    public void getPhoneNumber() {
        assertEquals("123456789", contact.getPhoneNumber());
    }
	
	// Test getAddress
    @Test
    public void getAddress() {
        assertEquals("fake street 2101", contact.getAddress());
    }

	// Test testToString
    @Test
    public void testToString() {
        assertEquals("Contact [contactID=1, firstName=firstName, lastName=lastName, phoneNumber=123456789, address=fake street 2101]", contact.toString());
    }
}