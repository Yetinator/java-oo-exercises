package Blogz;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostAndUserTest {
	
	private static boolean initialized = false;
	
	public PostAndUserTest() {
		//this code runs once per @Test
		if (!initialized) {
	            // code that should only run once goes here
	            initialized = true;
	        }
	}

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
	
	@Test
	public void checkPost() {
		Post a = new Post("This", "and That");
		System.out.println(a.getCreated());
		System.out.println(a.getModified());
		assertEquals("The Body is Wrong.", a.getBody(), "and That");
		assertEquals("The Title is wrong", a.getTitle(), "This");
		
	}
	
	@Test 
	public void checkUid() {
		User Sally = new User("Sally", "dog");
		User Bill = new User("Bill", "Cats");
		//System.out.println(Bill.getUid());
		//System.out.println(Sally.getUid());
		assertFalse("Uid all messed", Bill.getUid() == Sally.getUid() );
		//TODO make one for posts also
		
	}

}
