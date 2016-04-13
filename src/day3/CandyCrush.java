package day3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String ans = JOptionPane.showInputDialog("Name a person who you hate.");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + ans + "!");
		// 3. Ask the user for the name of their best friend
		String bff = JOptionPane.showInputDialog("Who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
		if (bff.equalsIgnoreCase("donald trump")) {
			JOptionPane.showMessageDialog(null, "Good for you.");
			JOptionPane.showMessageDialog(null, "Just kidding!");
		} else {
			JOptionPane.showMessageDialog(null, bff + " is as sweet as candy.");
		}
	}
}
