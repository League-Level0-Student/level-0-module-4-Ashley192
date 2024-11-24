package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
String fruit=JOptionPane.showInputDialog("How is your favorite fruit?");
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
System.out.println(fruit.charAt(2));
		
	
System.out.println(fruit.length());
for (int i=0; i<fruit.length(); i++) {
System.out.println(fruit.charAt(i));

}
for (int i=0; i<fruit.length(); i++) {
	if (fruit.charAt(i)=='a') {
		System.out.println("a is at index " + i);
	}
	}
		
		
	}
}


