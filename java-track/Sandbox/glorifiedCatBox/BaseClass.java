package glorifiedCatBox;

public class BaseClass {
	protected Text current;
	protected int variable = 5;
	
	public void setInterface(Text in) {
		this.current = in;
	}
	
	public void changeVariable(){
		//Should use current.something
		this.variable = current.interfaceVariable(); 
	}
	
	public void moveVariable(){
		this.variable = 5;
	}
	
	
	
	
}
