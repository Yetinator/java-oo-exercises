package Quiz;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultipleChoiceQTest {

	@Test
	public void TestCreate() {
		String[] wrong = {"This is wrong.  Don't select this entry.", "This might be right.  Maybe not.", "This is the trick answer.  You should select it."};
		MultipleChoiceQ question = new MultipleChoiceQ("How many Chipotle burritos can Steve eat in an hour?", "12", wrong);
		assertEquals("bad create question", question.AskMe(), "How many Chipotle burritos can Steve eat in an hour?\na.  This is wrong.  Don't select this entry.\nb.  This might be right.  Maybe not.\nc.  This is the trick answer.  You should select it.\nd.  12");
		System.out.println(question.AskMe());
		question.user(); 
		String user = question.UserInput;
		System.out.println(user);
	}
	
	@Test
	public void TestGrade() {
		String[] wrong = {"This is wrong.  Don't select this entry.", "This might be right.  Maybe not.", "This is the trick answer.  You should select it."};
		MultipleChoiceQ question = new MultipleChoiceQ("How many Chipotle burritos can Steve eat in an hour?(testgrad)", "12", wrong);
		//assertEquals("bad create question", question.AskMe(), "How many Chipotle burritos can Steve eat in an hour?\na.  This is wrong.  Don't select this entry.\nb.  This might be right.  Maybe not.\nc.  This is the trick answer.  You should select it.\nd.  12");
		//System.out.println(question.AskMe());
		question.user(); 
		System.out.println(question.UserInput);
		System.out.println(question.AnswerText);
		assertEquals("user input not equal to answer text", question.UserInput, question.AnswerText);
		assertEquals("grade doesn't work", question.grademe(), true);
		
	}

}
