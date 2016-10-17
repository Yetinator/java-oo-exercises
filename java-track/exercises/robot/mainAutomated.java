package robot;

public class mainAutomated {

	public static void main(String[] args) {
		//Name, xPosition, yPosition, heading, speed, hitpoints
		Robot tom = new AttackBot("Tom", 0,0,0, 15, 5);
		Robot jerry = new AttackBot("Jerry", 30,30,0,1,5);
		int count = 0;
		boolean proceedSir= true;
		int menuSelectionTom = 0;
		int menuSelectionJerry = 0;
		
		AggressiveBehavior chase = new AggressiveBehavior(tom, jerry);
		DefensiveBehavior run = new DefensiveBehavior(jerry, tom);
		
		tom.setBehavior(chase);
		jerry.setBehavior(run);
		
		while(count < 100 && proceedSir){
			System.out.println("count is:  " + count++);
			System.out.println(tom);
			System.out.println(jerry);
			
			menuSelectionJerry = jerry.current.doNextMove(jerry, tom);
			menuSelectionTom = tom.current.doNextMove(tom, jerry);
			jerry.behaviorMenu(menuSelectionJerry);
			tom.behaviorMenu(menuSelectionTom);
			
			
		}
		
	

	}

}
