package Quiz;
import java.util.Scanner;

public class Question {
	protected String QuestionText;
	protected String AnswerText;
	protected String UserInput;
	//protected int QuestionNumber;
	
	public Question(String QuestionText, String AnswerText){
		this.QuestionText = QuestionText;
		this.AnswerText = AnswerText;
	}
	
	public String AskMe() {
		String text = this.QuestionText;
		return text;
	}
	
	public String responseWrong() {
		String text = "You are so VERY wrong!  Learn more stuff!  ";
		return text;
	}
	
	public String responseRight() {
		String text = "ehhh... Ok.  I'll take that.  Well, its not technically... I'll allow it.";
		return text;
	}
		
	public void user() {
		Scanner reader = new Scanner(System.in);
		this.UserInput = reader.next();
		
	}
	
}
