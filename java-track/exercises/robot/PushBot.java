package robot;

public class PushBot extends Robot{
	public PushBot(String Name, int xPosition, int yPosition, int heading, int speed, int hitpoints){
		super(Name, xPosition, yPosition, heading, speed, hitpoints);
	}
	
	public void PushPush(Robot other, int time){
		int headingLocal = this.getHeading() % 360;
		int distance = time * this.getSpeed();
		if(this.xPosition == other.xPosition && this.yPosition == other.yPosition){
			if (headingLocal == 90)
			{
				this.xPosition = this.xPosition + distance;
				other.xPosition = other.xPosition + distance;
			}
			if (headingLocal == 180)
			{
				this.yPosition = this.yPosition - distance;
				other.yPosition = other.yPosition - distance;
			}
			if (headingLocal == 270)
			{
				this.xPosition = this.xPosition - distance;
				other.xPosition = other.xPosition - distance;
			}
			if (headingLocal == 0)
			{
				this.yPosition = this.yPosition + distance; 
				other.yPosition = other.yPosition + distance;
			}
		}
	}
}
