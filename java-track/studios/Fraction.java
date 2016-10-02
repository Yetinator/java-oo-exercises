
public class Fraction {
	
	private int whole;
	private int num;
	private int fullNum;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num % den;
		this.den = den;
		this.whole = num / den;
		this.fullNum = num;
	}
	
	public Fraction(int whole, int num, int den) {
		this.den = den;
		this.num = num / den;
		this.whole = num / den + whole;
		this.fullNum = this.whole * this.den + this.num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public int getDen() {
		return this.den;
	}
	public int getWhole() {
		return this.whole;
	}
	public int getFullNum() {
		return this.fullNum;
	}
	public String toString() {
		return "(" + this.whole + " and " + this.num + "/" + this.den + ") or also (" + this.fullNum + "/" + this.den + ")";
	}
	
	//add
	
	public Fraction add(Fraction other) {
		//create common denominator
		int denominator = this.den * other.den;
		//
		int numerator = this.fullNum * other.den + other.fullNum * this.den;
		System.out.println(numerator);
		Fraction added = new Fraction(numerator, denominator);
		Fraction simple = added.simplify();
		return simple;
	}
	
	//multiply
	public Fraction multiply(Fraction other) {
		int numerator = this.fullNum * other.fullNum;
		int denominator = this.den * other.den;
		Fraction mult = new Fraction(numerator, denominator);
		Fraction simple = mult.simplify();
		return simple;
	}
	
	
	//reciprocal of itself
	public Fraction reciprocal() {
		Fraction recip = new Fraction(this.den, this.fullNum);
		return recip;
	}
	
	//simplify
	public Fraction simplify() {
		
		int lowest = 1;
		//Test
		System.out.println("num and denom local : " + this.num + " " + this.den);
				
		//start at 1 and count to numerator 
		
		for (Integer i = 1; i <= this.num; i++) {
			//check i if works set crap
			if (this.num % i == 0 && this.den % i == 0){
				lowest = i;
			}
		}
		Fraction simple = new Fraction(this.fullNum/lowest, this.den/lowest);
		return simple;
	}
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction one = new Fraction(1,8);
		System.out.println(one.getNum());
		Fraction two = new Fraction(12,16);
		Fraction simple = two.simplify();
		System.out.println(simple);
		Fraction added = one.add(two);
		System.out.println(added);
		Fraction three = new Fraction(8,4);
		System.out.println(three);
		System.out.println(two);
		System.out.println(one);
		Fraction addedtwo = three.add(three);
		System.out.println(addedtwo);
		Fraction addedthree = three.add(two);
		System.out.println(addedthree);
		Fraction multone = one.multiply(two);
		System.out.println("multiplied" + multone);
		System.out.println("recip of " + addedtwo + "is " + addedtwo.reciprocal());
	}

}
