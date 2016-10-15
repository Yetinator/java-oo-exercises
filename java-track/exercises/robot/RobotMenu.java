package robot;

import java.util.Scanner;

public class RobotMenu {
	//Robot menu from I/O day 3 prep
	private Robot[] world;
	private String[] RobotTypes = {"Robot", "PushBot", "AttackBot"};

	public static void main(String[] args) {
		Robot[] world = new Robot[100];
		RobotMenu menu = new RobotMenu();
		menu.world = new Robot[100];
		menu.RunMenu();
		
	}//end Main
	public void falseMain() {
		//used for testing only
		Robot[] world = new Robot[100];
		//RobotMenu menu = new RobotMenu();
	}
	
 	public void RunMenu(){
		printHeader();
		int selection = -1;
		boolean exit = false;
		while(!exit){
			int length = printMenu();
			selection = getInput(length);
			exit = runAction(selection);
		}//end while sentinel
	}//end runMenu
	
	private void printHeader(){
		
		String[] line = {
		"\n",
		"-------------------------",
		"|                       |",
		"|     Robot Awesome     |",
		"|         Menu          |",
		"|                       |",
		"-------------------------",
		"\n"};
		
		for(int i = 0; i < line.length; i++){
			System.out.println(line[i]);
		}
		
		//beginning of menu header
	}
	
	private int printMenu(String[] choices){
		//for loop to print all menu choices(input for submenus???
		//String[] choices = {"this", "that"};
		
		for(int i = 0; i < choices.length ; i++){
			System.out.println((i+1) + ")  " + choices[i]);
		}
		return choices.length;
	}
	
	private int printMenu(){
		//overloaded default printMenu option
		String[] defaultChoice = {"Create a robot", "Display a list of robots", "Move a robot", "Rotate a robot", "Compute the distance between two robots","Exit"};
		printMenu(defaultChoice);
		return defaultChoice.length;
	}
	
	private int getInput(int menuLength){
		Scanner kb = new Scanner(System.in);
        int choice = -1;
        //while choice is invalid
        while(choice < 0 || choice > menuLength) {
            try {
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(kb.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid selection. Please try again.");
            }
            
        }
        return choice;
	}
	
	private String getStringInput(String feed){
		Scanner now = new Scanner(System.in);
		System.out.println(feed);
		System.out.print(">>");
		String user = now.nextLine();
		return user;
	}
	
	private boolean runAction(int selection){
		boolean exit = false;
		switch(selection){
		case 1:
			makeBot();
			break;
		case 2:
			displayBot();
			break;
		case 3:
			int arraySize = world.length + 1;
			System.out.println("Move which Robot?");
			int num = this.getInput(arraySize);
			System.out.println("How far?");
			int far = this.getInput(arraySize);
			world[num-1].move(far);
			break;
		case 4:
			int arraySizer = world.length + 1;
			System.out.println("Rotate which Robot?");
			int numr = this.getInput(arraySizer);
			System.out.println("1) Left\n2) Right");
			int left = this.getInput(2);
			if(left == 1){
				world[numr-1].rotate(true);
			}else{
				world[numr-1].rotate(false);
			}
			break;
		case 5:
			int arraySized = world.length + 1;
			System.out.println("From which Robot?");
			int rob1 = this.getInput(arraySized);
			System.out.println("To which Robot?");
			int rob2 = this.getInput(arraySized);
			int dist = world[rob1-1].distance(world[rob2-1]);
			System.out.println("\nThey are " + dist + " far appart.  \n");
			break;
		case 6:
			//exit
			
			exit = true;
		default:
			
			break;
	
	}
		return exit;
	}
	
	private void makeBot(){
		//user interface for robot constructor
		printMenu(this.RobotTypes);
		int typeNum = getInput(this.RobotTypes.length);
		
		
		
		String Name = this.getStringInput("What is the name of your robot?");
		
		int xPosition = 0;
		int yPosition = 0;
		int heading = 0;
		int speed = 5;
		int hitpoints = 0;
		
		//constructor
		switch(typeNum){
			case 1:
				this.world[getWorldSize()] = new Robot(Name, xPosition, yPosition, heading, speed, hitpoints);
				break;
			case 2:
				this.world[getWorldSize()] = new PushBot(Name, xPosition, yPosition, heading, speed, hitpoints);
				break;
			case 3:
				this.world[getWorldSize()] = new AttackBot(Name, xPosition, yPosition, heading, speed, hitpoints);
				break;
		}
	}
	
	private void displayBot(){
		for(int i = 0; i < this.getWorldSize(); i++){
			System.out.println((i + 1) + ") " + world[i]);
		}
	}
	private int getWorldSize(){
		int size = 0;
		while(size < this.world.length && this.world[size] != null){
			
			size++;
			
		}
		return size;
	}
	
}//end robotMenu Class

