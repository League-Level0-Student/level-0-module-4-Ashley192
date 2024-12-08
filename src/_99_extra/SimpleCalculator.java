package _99_extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String num1 = JOptionPane.showInputDialog("Give me one number.");

		String num2 = JOptionPane.showInputDialog("Give me another number.");
		int a =Integer.parseInt(num1);
		int b =Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Which mathematical operation do you want to perform?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Addition", "Subtraction", "Multiplication", "Division" }, null);
		
		System.out.println(operation);
		
		if (operation==(0)) {
			add( a,  b );}
			else if (operation==(1)) {
				subtract( a,  b );}
				else if (operation==(2)) {
					multiply( a,  b );}
					else if (operation==(3)) {
						divide( a,  b );

		}
	}

	// 5. Call the methods created in steps 3 and 4 to perform the appropriate
	// operation.

	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
	static void add (int a, int b) {

		JOptionPane.showInputDialog(a + " plus " + b + " equals " +  (a+b));
	}
	static void subtract(int a, int b) {
		JOptionPane.showInputDialog(a + " minus " + b + " equals " +  (a-b));

	}
	static void multiply(int a, int b) {
		JOptionPane.showInputDialog(a + " times " + b + " equals " +  (a *b));}
	
	static void divide(int a, int b) {
		JOptionPane.showInputDialog(a + " divided by " + b + " equals " +  (a/b));}
}
}