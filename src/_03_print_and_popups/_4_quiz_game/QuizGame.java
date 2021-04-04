package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score=0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String input=JOptionPane.showInputDialog("Which planet has the highest temperature?");
				// 3.  Use an if statement to check if their answer is correct
				if (input.equals("Venus")) {
					JOptionPane.showMessageDialog(null, "Correct!");
					score++;
				}
				else score--;
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		input=JOptionPane.showInputDialog("Which is the farthest dwarf planet in our solar system?");
		if (input.equals("Sedna")) {
			JOptionPane.showMessageDialog(null, "That's right");
			score+=1;
		}
		else score-=1;
		input=JOptionPane .showInputDialog("Which planets/moons other than Earth may or may have possibly hosted life?");
			if (input.equals("Venus, Mars, and Europa")) {
				JOptionPane.showMessageDialog(null, "Cool!");
				score=score+1;
			}
			else score=score-1;
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Score is "+score);
	}
}
