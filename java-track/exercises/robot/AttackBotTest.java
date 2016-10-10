package robot;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttackBotTest {

	@Test
	public void testAttack() {
		AttackBot bot1 = new AttackBot("bully", 1, 1, 90, 5, 5);
		Robot bot2 = new Robot("little guy", 1, 1, 0, 6, 5);
		bot1.AttackAttack(bot2, 2);
		assertEquals("Attack Wrong", bot2.getHitpoints(), 3);
		assertEquals("construct wrong", bot1.getHitpoints(), 5);
	}

}
