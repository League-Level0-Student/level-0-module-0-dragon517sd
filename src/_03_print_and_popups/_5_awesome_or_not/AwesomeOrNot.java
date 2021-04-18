package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below

	public static void main(String[] args) {
		
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int numb=0;
		System.out.println(numb);
		System.out.println(numb++);
		System.out.println(++numb);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		numb=ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(numb);
		// 4. Get the user to enter something that they think is awesome
		String input=JOptionPane.showInputDialog("Enter something that's awesome!!");
		// 5. If your variable is  0
		if (numb==0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, input+" is awesome!");
		}
		
		// 6. If your variable is  1
		if (numb==1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, input+" is okay.");
		}
		// 7. If your variable is  2
		if (numb==2) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, input+" is boring...");
		}
		// 8. If your variable is  3
		if (numb==3) {
			// -- invent your own message to give to the user (be nice).
		JOptionPane.showMessageDialog(null, input+" is the greatest");	
	}
	}
}
