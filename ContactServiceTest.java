// Colton Stiff
// 2021-07-18
// SNHU
// CS-320: 3-2 Milestone: Contact Service

package contact;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactServiceTest {
	
	// Test testAdd
	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("22", "Jimmy", "Butler", "3053052222", "22 Heat House Dr");
		assertEquals(true, cs.addContact(test1));
	}
	
	// Test testDelete
	@Test
	public void testDelete() {
		ContactService cs = new ContactService();
		
		Contact test1 = new Contact("22", "Jimmy", "Butler", "3053052222", "22 Heat House Dr");
		Contact test2 = new Contact("13", "Bam", "Adebayo", "3053051313", "13 Heat House Dr");
		Contact test3 = new Contact("07", "Goran", "Dragic", "3053050707", "7 Heat House Dr");
	
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.deleteContact("13"));
		assertEquals(false, cs.deleteContact("1309404"));
		assertEquals(false, cs.deleteContact("13"));
	}
	
	// Test testUpdate
	@Test
		public void testUpdate() {
		ContactService cs = new ContactService();
			
		Contact test1 = new Contact("22", "Jimmy", "Butler", "3053052222", "22 Heat House Dr");
		Contact test2 = new Contact("13", "Bam", "Adebayo", "3053051313", "13 Heat House Dr");
		Contact test3 = new Contact("07", "Goran", "Dragic", "3053050707", "7 Heat House Dr");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true, cs.updateContact("07", "GoranFirst", "DragicLast", "3053050707", "7 Heat House Dr"));
		assertEquals(false, cs.updateContact("23", "GoranFirst", "DragicLast", "3053050707", "7 Heat House Dr"));
	}

}