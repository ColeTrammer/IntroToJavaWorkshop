package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello?");
		String name = JOptionPane.showInputDialog("What is your name?");
		String address = JOptionPane.showInputDialog("Thanks " + name + ". Where do you live?");
		JOptionPane.showMessageDialog(null, "I'm glad to know you live at " + address + "!");
		String age = JOptionPane.showInputDialog("So, how long have you lived in this world?");
		JOptionPane.showConfirmDialog(null, "Wow! I think " + age + " is definately too much! Do you?");
		JOptionPane.showMessageDialog(null, "Guess what? I don't care!");
		JOptionPane.showMessageDialog(null, "...");
	}
}
