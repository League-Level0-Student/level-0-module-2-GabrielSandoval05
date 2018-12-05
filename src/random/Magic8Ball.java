//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
       Random randy= new Random();
     int answer=randy.nextInt(7);
	// 3. Print out this variable
System.out.println(answer);
	// 4. Get the user to enter a question for the 8 ball
String question= JOptionPane.showInputDialog("What question would you like to ask?");
	// 5. If the random number is 0
if( answer == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if( answer == 1) {
	JOptionPane.showMessageDialog(null, "No, you will now simply cease to exit for asking such a thing");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if( answer == 2) {
	JOptionPane.showMessageDialog(null, "Ask google, you DO have the world's knowedge at your fingetips after all");
}

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
if( answer == 3) {
	JOptionPane.showMessageDialog(null, "The apothicon presence denies me permission to respond");
}
if( answer == 4) {
	JOptionPane.showMessageDialog(null, "The world won't always be rainbows and sunshine");
}
if( answer == 5) {
	JOptionPane.showMessageDialog(null, "The world won't always be rainbows and sunshine you know, but it is right now :)");
}
if( answer == 6) {
	JOptionPane.showMessageDialog(null, "IDK if this is right or wrong, but I aim for happiness on Earth!");
}

}
}
