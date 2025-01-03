package _99_extra;

import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {
int current = 1;
	void makeQuestions() {
		question1 = new JLabel(
				"<html>Which is not a real fruit? <br> A: Dragon Fruit <br> B: Durian <br> C: Crazyberry</html>");
		// 11. Make another question called "question2". Use question1 above as a guide.
		question2 = new JLabel("<html>Which animal can fly? <br> A: Chicken <br> B: Mosquito<br> C: Penguin </html> ");
		question3 = new JLabel("<html>Which fruit is green? <br> A: Lemon <br> B: Lime<br> C: Orange </html> ");

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
		System.out.println(keyCode);
		// 2. Make 3 int variables that hold the key codes for A, b, and C
		int a = 65;
		int b = 66;
		int c = 67;

		
// 3. If they selected the right fruit, do steps 4 and 7
		if (keyCode == (c) && current == 1) {
			correct();
			playSound("correct.wav");
			nextQuestion(question2);
			current = 2;
		} 
		else if (keyCode == (b) && current == 2) {
			correct();
			nextQuestion(question3);
			current = 3;
		} 

		else if (keyCode == (b) && current == 3) {
			correct();
			playSound("correct.wav");
			System.exit(current);

		} else {
			incorrect();
			playSound("wrong.wav");

		}

	}
	

// 4. Call the correct() method
	// 14. Repeat steps 11, 12, and 13 for question3 and question4 - IMPORTANT: The
	// questions must be in reverse order from top to bottom to work properly

	// 12. If question2 is showing,

	// 13. check if it is right or wrong like you did for question1

	// 7. Use the nextQuestion() method to go to question2

	// 8. else (if they touched something else)

	// 9. Call the incorrect() method

	private void correct() {
		// 5. Find a sound for when they get a question right, and drag it into
		// the 'extra' package. It must be a .wav file.
		// There are lots on freesound.org
		// 6. Use the playSound method to play your sound

	}

	private void incorrect() {
		// 10. Find a sound for wrong answers and put it in the default package. Use the
		// playSound method to play it.

	}

	private void nextQuestion(JLabel newQuestion) {
		frame.getContentPane().removeAll();
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5;
}
