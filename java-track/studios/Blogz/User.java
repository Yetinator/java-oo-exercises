package Blogz;

public class User {
	
	private String hash;
	private String password; // password should not be stored?
	private String userName;
	
	public User(String userName, String password) {
		//constructor
		this.userName = userName;
		this.hash = HashPassword(password);
		
	}
	
	public static boolean isValidUserName(String userNameAttempt){
		/*
		 * A username should be considered valid if it is 4-12 
		 * characters long, starts with a letter, and contains only 
		 * letters, numbers, -, and _
		 */
		boolean lengthGood = false;
		boolean startsLetter = false;
		boolean charactorsGood = true;//this one starts good
		
		int length = userNameAttempt.length();
		if(length < 13 && length > 3)
			lengthGood = true;
		if (Character.isLetter(userNameAttempt.charAt(0)))
			startsLetter = true;
		
		//below is used for for loop
		boolean let = false;
		boolean num = false;
		boolean dash = false;
		Character position;
		
		/*
		for(int i = 0; i < userNameAttempt.length(); i++){
			let = false;
			num = false;
			dash = false;
			position = userNameAttempt.charAt(i);//position is a character
			if(Character.isLetter(position))
				let = true;//if this instance is a letter...
			if (Character.isDigit(position))
				num = true;
			if (position.equals("-") || position.equals("_"))
				dash = true;
			if(let == false && num == false && dash == false)
				charactorsGood = false;
		}
		if(lengthGood && startsLetter && charactorsGood)
			return true;
		return false;
		*/
		//use regular expression pattern
	}
	
	private static String HashPassword (String password) {
		//Todo hash this stuff
		return password;
	}
	
	protected boolean isValidPassword (String password) {
		String hashNew = HashPassword(password);
		
		if(hashNew.equals(this.hash))
			return true;
		else
			return false;
	}
	
	protected String getHash(){
		return this.hash;
	}
	
	

}
