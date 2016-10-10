package robot;

import static org.junit.Assert.*;

import org.junit.Test;


public class PushBotTest {
	
	@Test
	public void testPushPush() {
		PushBot bot1 = new PushBot("bully", 1, 1, 90, 5, 5); 
		Robot bot2 = new Robot("little guy", 1, 1, 0, 6, 5);
		bot1.PushPush(bot2, 3);
		assertEquals("bots not at same location", bot1.xPosition, bot2.xPosition);
		assertEquals("bots not at same location", bot1.yPosition, bot2.yPosition);
		assertEquals("bots didn't move in the right direction", bot1.xPosition, 16);
		assertEquals("bots didn't move in the right direction", bot1.yPosition, 1);
		Robot bot3 = new Robot("stationary", 1, 1, 0, 6, 5);
		bot1.PushPush(bot2, 3);
		assertEquals("opps, bot wasn't supposed to move", bot3.getxPosition(), 1);
		assertEquals("oops, bot wasn't supposed to move", bot3.getyPosition(), 1);
	}
	
	public void testInherit() {
		PushBot bot1 = new PushBot("bully", 1, 1, 90, 5, 5); 
		assertEquals("Did not inherit", bot1.getName(), "bully");
		
	}

}
