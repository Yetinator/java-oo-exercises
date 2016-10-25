package springyHorseys;

import java.util.Scanner;

public class ScannerFun {
	
	private String[] items = {"First", "Second", "Third"};
	private int[] input = new int[5];
	
	public static void main(String[] args) {
		ScannerFun menu = new ScannerFun();
		//menu.display();
		//menu.input();
		//menu.output();
		//menu.input();
		//menu.output();
		Scanner input2 = new Scanner(System.in);
		int y;
		boolean proceed = true;
		do{
			menu.display();
			y = input2.nextInt();
			if(input2.hasNextInt()){
					y = menu.inputUser2(input2);
					proceed = false;
			}
		}while(proceed);
	}
	
	private void display(){
		for(int i = 0; i < items.length; i++){
			System.out.println(i+ "): " + items[i]);
		}
	}
	
	private void input(){
		Scanner input1 = new Scanner(System.in);
		for(int i = 0; i < input.length; i++)
			input[i] = input1.nextInt();
	}
	private void output(){
		for(int i = 0; i < input.length; i++)
			System.out.println(input[i]);
	}
	
	private int inputUser2(Scanner in){
		System.out.println("Pick something dude");
		int x = in.nextInt();
		return x;
	}
	

}
