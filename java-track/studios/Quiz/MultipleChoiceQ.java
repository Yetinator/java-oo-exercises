package Quiz;

public class MultipleChoiceQ extends Question {
	private String[] wrongAnswer;
	private int correctAnswerLocation;
	
	public MultipleChoiceQ(String QuestionText, String AnswerText, String[] wrongAnswer){
		super(QuestionText, AnswerText);
		this.wrongAnswer = wrongAnswer;
		this.correctAnswerLocation = 2;
	}
	
	public String AskMe(){
		String text = super.AskMe();
		String[] letter = {"a", "b", "c", "d"};
		for(int i = 0; i < this.wrongAnswer.length; i ++){
			
			text = text + "\n" + letter[i] + ".  " + this.wrongAnswer[i];
		}
		text = text + "\n" + letter[3] + ".  " + this.AnswerText;
		return text;
		
	}
	
	
	
}
