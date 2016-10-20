package springyHorseys;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {

	public static void main(String[] args) {
		 
		
		Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]{4,11}");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		
		System.out.println(p);
		System.out.println(m);
		System.out.println(b);

	}

}
