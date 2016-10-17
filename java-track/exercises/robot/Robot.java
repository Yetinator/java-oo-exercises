package robot;

public class Robot {
/*
	public static void main(String[] args) {
		Robot bob = new Robot("bobby", 1, 1, 90, 5);
		System.out.println(bob);
		bob.rotate(true);
		bob.move(5);
		System.out.println(bob);
		Robot alice = new Robot("alice",1,1,90,5);
		System.out.println(alice.distance(bob));
	}*/	

	
	//Fields
	private String Name;
	protected int xPosition, yPosition;
	private int speed;
	private Integer heading;
	private int hitpoints;
	protected RobotBehavior current;
	
	public int getHitpoints(){
		return hitpoints;
	}
	
	public void setHitpoints(int num){
		this.hitpoints = num;
	}
	public void changeHitpoints(int change){
		this.hitpoints = this.hitpoints + change;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @return the xPosition
	 */
	public int getxPosition() {
		return xPosition;
	}
	/**
	 * @return the yPosition
	 */
	public int getyPosition() {
		return yPosition;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @return the heading
	 */
	public int getHeading() {
		return heading;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @param xPosition the xPosition to set
	 */
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	/**
	 * @param yPosition the yPosition to set
	 */
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setBehavior(RobotBehavior current){
		this.current = current;
	}
	/**
	 * @param heading the heading to set
	 */
	public void setHeading(int heading) {
		this.heading = heading;
	}
	public Robot(String Name, int xPosition, int yPosition, int heading, int speed, int hitpoints)
	{
		this.Name = Name;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.speed = speed;
		this.heading = heading;
		this.hitpoints = hitpoints;
	}
	//move
	public void move(int time)
	{
		int headingLocal = this.heading % 360;
		int distance = time * this.speed;
		if (headingLocal == 90)
		{
			this.xPosition = this.xPosition + distance;
		}
		if (headingLocal == 180)
		{
			this.yPosition = this.yPosition - distance;
		}
		if (headingLocal == 270)
		{
			this.xPosition = this.xPosition - distance;
		}
		if (headingLocal == 0)
		{
			this.yPosition = this.yPosition + distance;
		}
	}
	//rotate
	public void rotate(boolean Left)
	{
		int headingLocal = this.heading;
		if (Left)
		{
			headingLocal = (this.heading - 90) % 360;
		}
		if (!Left)
		{
			headingLocal = (this.heading + 90) % 360;
		}
		while (headingLocal < 0) {
			headingLocal += 360;
		}
		this.heading = headingLocal;
		
	}
	
	//distance from another
	public int distance(Robot other)
	{
		int xDist = Math.abs(this.xPosition - other.xPosition);
		int yDist = Math.abs(this.yPosition - other.yPosition);
		double totalDist = Math.sqrt(Math.pow(xDist, 2)  + Math.pow(yDist, 2));
		return (int) (totalDist);
	}
	
	public int opponentHeading(Robot other){
		//returns the most notable direction of the opponent
		int xDist = this.xPosition - other.xPosition;
		int yDist = this.yPosition - other.yPosition;
		int opponent = 0;
		if(Math.abs(xDist) > Math.abs(yDist)){
			//xdist Greater
			if(xDist > 0){
				//this means this is further right than other
				opponent = 270;
			}else{
				opponent = 90;
			}
		}else {
			//ydist Greater
			if (yDist > 0) {
				//this means this is further north than other(opponent south)
				opponent = 180;
			
			}else{
				opponent = 0;
			}
			
			
		}
		
		return opponent;
	}
	
	public void behaviorMenu(int menuChoice){
		/*
	 0) error
	 1) turn right
	 2) turn left
	 3)	move forward
	 4)
	 5)
	 6)
	 7)
	 8)
	 9)
	 10)
*/
		switch(menuChoice){
			case 0:
				System.out.println("error in menuChoice case 0");
				break;
			case 1:
				rotate(false);
				break;
			case 2:
				rotate(true);
				break;
			case 3:
				move(1);
				break;
			case 4:
				//other menu
				break;
			default:
				System.out.println("error in menuChoice falls through to defualt");
				break;
		}
	}
	
	//return a string
	public String toString()
	{
		return "Robot: " + this.Name + " is a sentient being at position (" + this.xPosition + "," + this.yPosition + ") and is going " + this.speed +  " miles per hour at heading " + this.heading;
	}
}
