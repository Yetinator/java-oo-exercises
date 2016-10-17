package robot;

public class AttackBot extends Robot{
	
	public AttackBot(String Name, int xPosition, int yPosition, int heading, int speed, int hitpoints) {
		super(Name, xPosition, yPosition, heading, speed, hitpoints);
	}
	
	public void AttackAttack(Robot other, int hits){
		if(this.xPosition == other.xPosition && this.yPosition == other.yPosition){
			other.changeHitpoints(-(hits));
		}
	}

	/* (non-Javadoc)
	 * @see robot.Robot#behaviorMenu(int)
	 */
	@Override
	public void behaviorMenu(int menuChoice) {
		// TODO Auto-generated method stub
		super.behaviorMenu(menuChoice);
		switch(menuChoice){
		case 4:
			//AttackAttack(other, 2);
			System.out.println("---------");
			System.out.println("-Attack!-");
			System.out.println("---------");
			break;
		}
	}
	
	
	
	
}
