package robot;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {

	@Test
	public void testMove() {
		Robot box = new Robot("boxey90", 1, 1, 90, 5, 5);
		assertTrue("Problem with setup", box.getxPosition() == 1 && box.getyPosition() ==1);
		box.move(2);
		assertTrue("Problem with 90 degrees movement " + box.getName(), box.getxPosition() == (1+5*2) && box.getyPosition() == 1); //speed times time (move input)
		
		//180
		Robot box2 = new Robot("boxey180", 1, 1, 180, 5, 5);
		assertTrue("Problem with setup " + box2.getName(), box2.getxPosition() == 1 && box2.getyPosition() ==1);
		box2.move(2);
		assertTrue("Problem with 180 degrees movement " + box2.getName(), box2.getxPosition() == 1 && box2.getyPosition() == (1-5*2)); //speed times time (move input)
		
		//270
		Robot box3 = new Robot("boxey270", 1, 1, 270, 5, 5);
		assertTrue("Problem with setup", box3.getxPosition() == 1 && box3.getyPosition() ==1);
		box3.move(2);
		assertTrue("Problem with 270 degrees movement " + box3.getName(), box3.getxPosition() == (1-5*2) && box3.getyPosition() == 1); //speed times time (move input)
		
		//0
		Robot box4 = new Robot("boxey0", 1, 1, 0, 5, 5);
		assertTrue("Problem with setup", box4.getxPosition() == 1 && box4.getyPosition() ==1);
		box4.move(2);
		assertTrue("Problem with 0 degrees movement", box4.getxPosition() == 1 && box4.getyPosition() == (1+5*2)); //speed times time (move input)
		
		//360
		Robot box5 = new Robot("boxey360", 1, 1, 360, 5, 5);
		assertTrue("Problem with setup", box5.getxPosition() == 1 && box5.getyPosition() ==1);
		box5.move(2);
		assertTrue("Problem with 360 degrees movement", box5.getxPosition() == 1 && box5.getyPosition() == (1+5*2)); //speed times time (move input)
	}
	
	@Test
	public void testRotate() {
		Robot box = new Robot("box Rotate", 1, 1, 0, 5, 5);
		box.rotate(true); //true means left
		assertTrue("problem with left turn 1", box.getHeading() == 270);
		
		box.rotate(true); //true means left
		assertTrue("problem with left turn 2", box.getHeading() == 180);
		
		box.rotate(false); //true means left
		assertTrue("problem with right turn 1", box.getHeading() == 270);
		
		box.rotate(false); //true means left
		assertTrue("problem with right turn 2", box.getHeading() == 0);
		
		box.rotate(false); //true means left
		assertTrue("problem with right turn 3", box.getHeading() == 90);
	}
	
	@Test
	public void testDistance() {
		Robot box1 = new Robot("box one", 1 ,1, 0, 5, 5);
		Robot box2 = new Robot("box two", 6, 6, 0, 5, 5);
		//System.out.println(box1.distance(box2));
		//System.out.println(box2.distance(box1));
		assertTrue("box distance wrong", box1.distance(box2) ==  7);
	}
	
	@Test	
	public void testHitpoints() {
		Robot box1 = new Robot("box one", 1 ,1, 0, 5, 5);
		box1.changeHitpoints(3);
		assertEquals("hitpoints wrong", box1.getHitpoints(), 8);
	
	}

}
