package ex3i;

import javax.swing.DefaultListModel;

public class DriverExam {
	private char[] answers;
	private char[] responses;
//	private char[] responses = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D'};
	private final double requiredPct = 0.7;
	
	public DriverExam(char[] answers) {
		this.answers = new char[answers.length];
		
		for (int index = 0; index < answers.length; index++)
			this.answers[index] = answers[index];
	}
	
	public DriverExam(DefaultListModel answers) {
		throw new UnsupportedOperationException();
	}
	
	public void setResponses(DefaultListModel responses) {
		this.responses = new char[responses.getSize()];
		
		for (int i = 0; i < responses.getSize(); i++) {
			String r = (String) responses.get(i);
			this.responses[i] = r.charAt(0);
		}
	}
	
	public DefaultListModel getAnswers () {
		throw new UnsupportedOperationException();
	}
	
	public int validate() {
		int i = 0;
		
		while (i < answers.length)
			{
				if (this.responses[i] != 'A')
					i = i;
				else if (this.responses[i] != 'B')
					i = i;
				else if (this.responses[i] != 'C')
					i = i;
				else if (this.responses[i] != 'D')
					i = i;
				i++;
			}
		return i;
	}
	
	public boolean passed() {
		int correct = this.totalCorrect();
		
		if (correct > requiredPct * answers.length)
			{
			return true;
			}
		else
			{
			return false;
			}
	}
	
	public int totalCorrect() {
		int correct = 0;
		
		for (int i = 0; i < answers.length; i++) 
			{
			  if (answers[i] == responses[i]) correct++;
			}
		return correct;
	}
	
	public int totalIncorrect() {
		int incorrect = 0;
		
		for (int i = 0; i < answers.length; i++)
			{
			  if(!(answers[i] == responses[i])) incorrect++;
			}
		return incorrect;
	}
	
	public int[] questionMissed() {
		int missed[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i, m = 0;
		
		for (i = 0; i < answers.length; i++)
			{
				if (!(answers[i] == responses[i]))
					{
						missed[m] = i + 1;
						m++;
					}
			}
		return missed;
	}
	
}
