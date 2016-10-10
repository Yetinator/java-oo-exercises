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
}
