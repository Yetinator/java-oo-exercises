
public class Robot {

	public static void main(String[] args) {
		Robot bob = new Robot("bobby", 1, 1, 90, 5);
		System.out.println(bob);
		bob.rotate(true);
		bob.move(5);
		System.out.println(bob);
		Robot alice = new Robot("alice",1,1,90,5);
		System.out.println(alice.distance(bob));
		

	}
	//Feilds
	private String Name;
	private int xPosition, yPosition;
	private int speed;
	private int heading;
	
	
	public Robot(String Name, int xPosition, int yPosition, int heading, int speed)
	{
		this.Name = Name;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.speed = speed;
		this.heading = heading;
	}
	//move
	public void move(int time)
	{
		int distance = time * this.speed;
		if (this.heading == 0)
		{
			this.xPosition = this.xPosition + distance;
		}
		if (this.heading == 90)
		{
			this.yPosition = this.yPosition - distance;
		}
		if (this.heading == 180)
		{
			this.xPosition = this.xPosition - distance;
		}
		if (this.heading == 270)
		{
			this.yPosition = this.yPosition + distance;
		}
	}
	//rotate
	public void rotate(boolean Left)
	{
		if (Left)
		{
			this.heading = (this.heading - 90) % 360;
		}
		if (!Left)
		{
			this.heading = (this.heading + 90) % 360;
		}
		
	}
	
	//distance from another
	public int distance(Robot other)
	{
		int xDist = this.xPosition - other.xPosition;
		int yDist = this.yPosition - other.yPosition;
		int totalDist = (xDist ^ 2 + yDist ^ 2) ^ (1/2);
		return totalDist;
	}
	
	//return a string
	public String toString()
	{
		return "Robot: " + this.Name + " is a sentient being at position (" + this.xPosition + "," + this.yPosition + ") and is going " + this.speed +  " miles per hour at heading " + this.heading;
	}
}
