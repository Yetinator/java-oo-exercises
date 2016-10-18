package Blogz;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostAndUserTest {

	@Test
	public void testConstruct() {
		User Brian = new User("Brian", "Hellosecret");
		
	}
	
	@Test
	public void validPassword() {
		User Bob = new User("Bob", "Bunnies");
		Bob.isValidPassword("Bunnies");
	}
	
	@Test
	public void checkHash() {
		User Bill = new User("Bill", "Cats");
		//System.out.println(Bill.getHash());
		String localHash = "Cats";
		assertEquals("CheckHash fail", Bill.getHash(), localHash);
	}
	
	@Test
	public void checkIsValidUserName() {
		User Sally = new User("Sally", "dog");
		
		assertTrue(User.isValidUserName("Sally"));
		assertFalse(User.isValidUserName("Sally "));
		assertTrue(User.isValidUserName("Sal-ly"));
		assertTrue(User.isValidUserName("Sally_"));
		assertTrue(User.isValidUserName("Sal2ly"));
		assertFalse(User.isValidUserName("1Sally"));

	}

}
