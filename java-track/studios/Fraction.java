
public class Fraction {
	
	private int num;
	private int den;
	
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public int getNum() {
		return this.num;
	}
	
	//add
	
	public Fraction add(Fraction other) {
		//create common denominator
		int denominator = this.den * other.den;
		//
		int numerator = this.num * other.den + other.num * this.den;
		System.out.println(numerator);
		Fraction added = new Fraction(numerator, denominator);
		Fraction simple = added.simplify();
		return simple;
	}
	/*
	//multiply
	public multiply(Fraction other) {
		
	}
	//reciprocal of itself
	public reciprocal() {
		
	}*/
	//simplify
	public Fraction simplify() {
		int lowest = this.num;
		if (this.num % this.den == 0){
			Fraction simple = new Fraction(this.num, this.den);
			return simple;
		}
		//if num is smaller than denom
		if (this.num < this.den){
			//start at num and count down
			
			for (Integer i = 1; i <= this.num; i++) {
				//check i if works set crap
				if (this.num % i == 0 && this.den % i == 0){
					lowest = i;
				}
			}
		Fraction simple = new Fraction(this.num/lowest, this.den/lowest);
		return simple;
		}
		return new Fraction(this.num, this.den);
	}
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction one = new Fraction(1,8);
		System.out.println(one.getNum());
		Fraction two = new Fraction(12,16);
		Fraction simple = two.simplify();
		System.out.println(simple.num + " " + simple.den);
		Fraction added = one.add(two);
		System.out.println(added.num + " " + added.den);

	}

}
