package robot;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotMenuTest {

	@Test
	public void testGetWorldSize() {
		RobotMenu a = new RobotMenu();
		a.falseMain();
		assertEquals("world size didn't start at 0", a.getWorldSize(), 0);
	}

}
