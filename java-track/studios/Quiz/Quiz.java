package Quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Quiz a = new Quiz();
		for(int i = 0; i < a.lquestions.length; i++){
			if (a.lquestions[i] != null){
			
				System.out.println(a.lquestions[i].AskMe());
				
				a.lquestions[i].user();
				if (a.lquestions[i].grademe()){
					a.correct += 1;
				}
				a.total += 1;
			}//end null check
			
		}//end for
		System.out.println("Your Grade sir: " + a.correct + "/" + a.total);
		// TODO Auto-generated method stub

	}
	
	public Question[] lquestions;
	private int[] arrayex2;
	private MultipleChoiceQ question1;
	private int correct;
	private int total;
	
	

	/**
	 * @param lquestions
	 * @param arrayex2
	 * @param question1
	 */
	public Quiz() {
		this.correct = 0;
		this.total = 0;
		this.lquestions = new Question[10];
		
		String[] wrong1 = {"13","11.5","20"};
		this.lquestions[0] = new MultipleChoiceQ("How many Chipotle burritos can Steve eat in an hour",
				"12", 
				wrong1);
		
		String[] wrong2 = {"Quidoba","Lion's Choice","TreeHouse"};
		this.lquestions[1] = new MultipleChoiceQ("What is Steve's favorite resturant? ",
				"Chipotle", 
				wrong2);
		
		this.lquestions[2] = new FillInTheBlankQ("How do you spell Supercagafragalisticexpiolodocious?", "Supercagafragalisticexpiolodocious");
		
		
	}
}
