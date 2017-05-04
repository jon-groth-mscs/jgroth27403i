package ex3i;

public class Main {

	public static void main(String[] args) {
		char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D'};
		DriverExam exam = new DriverExam(answers);
		
		
//		System.out.println("First invalid response: " + exam.validate());
//		System.out.println("Correct: " + exam.totalCorrect());
		System.out.println("Incorrect: " + exam.totalIncorrect());
		
		if (exam.passed())
			System.out.println("Passed test");
		else
			System.out.println("Try again");
		
		System.out.print("Questions missed:");
		int [] missed = exam.questionMissed();
		int i = 0;
		
		while (i < missed.length && missed[i] > 0) {
			System.out.println(" " + missed[i]);
			i++;
		}
		return;
	

	}
}