package robot;

public class DefensiveBehavior implements RobotBehavior {

	

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
		
		public DefensiveBehavior(Robot A, Robot B){
			this.same = A;
			this.other = B;
			this.distance = same.distance(other);
			this.opponentHeading = same.opponentHeading(other);
			this.menuChoice = 0;
			
		}
		@Override
		public int doNextMove(Robot c, Robot d) {
			/*
			if((opponentHeading) != same.getHeading()){
				if(opponentHeading + 90 == same.getHeading()){
					//turn right
					this.menuChoice = 1;
					return this.menuChoice;
				}else{
					//turn left
					this.menuChoice = 2;
					return this.menuChoice;
				}
			}else{
				if(this.distance > 1){
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
			*/
			return 3;
		}
		
		

	}



