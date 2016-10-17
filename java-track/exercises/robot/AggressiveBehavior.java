package robot;

public class AggressiveBehavior implements RobotBehavior {

	private Robot same;
	private Robot other;
	private int distance;
	private int opponentHeading;
	private int menuChoice;
		/*
		 0) error
		 1) turn right
		 2) turn left
		 3)	move forward
		 4) Attack
		 5)
		 6)
		 7)
		 8)
		 9)
		 10)
		 */
	
	public AggressiveBehavior(Robot A, Robot B){
		this.same = A;
		this.other = B;
		this.distance = same.distance(other);
		this.opponentHeading = same.opponentHeading(other);
		this.menuChoice = 0;
		
	}
	@Override
	public int doNextMove(Robot c, Robot d) {
		this.same = c;
		this.other = d;
		this.distance = same.distance(other);
		this.opponentHeading = same.opponentHeading(other);
		if(!facingOpponent()){
			//should turn
			this.menuChoice = 2;
			/*if(opponentHeading + 90 == same.getHeading()){
				//turn right
				this.menuChoice = 1;
				return this.menuChoice;
			}else{
				//turn left
				this.menuChoice = 2;
				return this.menuChoice;
			}*/
		}else{
			if(this.distance > same.getSpeed()){
				//move forward
				this.menuChoice = 3;
			}
			if(this.distance < 1){
				//attack
				this.menuChoice = 4;
				return menuChoice;
			}
		}
		
		return menuChoice;
	}
	
	boolean facingOpponent(){
		//System.out.println("opponent heading:  " + this.opponentHeading);
		if(same.getHeading()==same.opponentHeading(other)){
			return true;
		}
		return false;
	}
	
	

}
