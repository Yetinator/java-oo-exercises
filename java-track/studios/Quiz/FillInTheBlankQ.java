package Quiz;

public class FillInTheBlankQ extends Question {
	public FillInTheBlankQ(String QuestionText, String AnswerText){
		super(QuestionText, AnswerText);
		
	}
	public String AskMe(){
		String text = super.AskMe() + "\n" + ">>";
		
		return text;
	}
}
