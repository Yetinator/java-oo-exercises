package glorifiedCatBox;

public class Controller {

	public static void main(String[] args) {
		//just run stuff
		
		//Below deals with the intefaced class directly
		Text a = new Interface();
		Text b = new Interface2();
		
		a.dumbdumb();
		System.out.println(a.returnString());
		
		b.dumbdumb();
		System.out.println(b.returnString());
		
		//Now try to call an intefaced class through the BaseClass (like the class Robot)
		BaseClass c = new BaseClass();
		c.setInterface(a);
		
		System.out.println("Entering Base Class");
		c.current.dumbdumb();
		System.out.println(c.variable);
		c.current.interfaceVariable();
		System.out.println(c.variable);
		c.changeVariable();//use base class to change base class using interface method
		System.out.println(c.variable);
		


	}

}
