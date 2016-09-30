
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
		
	
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	public int getArea() {
		return this.length * this.width;
	}
	public int getPerim() {
		return this.length *2 + this.width*2;
	}
	public boolean isSquare(){
		if (this.length == this.width) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Rectangle aRectangle = new Rectangle(5,5); 
		System.out.println(aRectangle.getArea());
		System.out.println(aRectangle.getPerim());
		System.out.println(aRectangle.isSquare());
	}

}
