package Quiz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FillInTheBlankQTest {

	@Test
	public void testFillIn() {
		FillInTheBlankQ question = new FillInTheBlankQ("What is Steve's favorite food?", "Chipotle!");
		System.out.println(question.AskMe());
	}

}
