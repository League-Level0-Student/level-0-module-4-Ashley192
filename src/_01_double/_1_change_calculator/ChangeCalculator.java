package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int number= Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes=JOptionPane.showInputDialog("How many dimes do you have?");
int numberOfD=Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarter=JOptionPane.showInputDialog("How many quaters do you have?");
int numberOfQ=Integer.parseInt(quarter);
		// Calculate how much money the user has.  Hint: Use a double variable 
double total= 0;
total+=     number*0.05; 
total+=     numberOfD*0.1;
total+=     numberOfQ*0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showInputDialog("$"+total);
	}
}

