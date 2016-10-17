package glorifiedCatBox;

public class Interface implements Text {

	@Override
	public String returnString() {
		// TODO Auto-generated method stub
		return magic;
	}

	@Override
	public void dumbdumb() {
		// TODO Auto-generated method stub
		System.out.println("Hey!  Something worked!");
	}

	@Override
	public void changeSomething() {
		// This should change the variable "variable" in the BaseClass
		
	}

	@Override
	public int interfaceVariable() {
		int a = (int) (Math.random() * 100);
		return a;
	}

}
