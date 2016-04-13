package day3;

import javax.swing.JOptionPane;

public class Hi {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "Hi " + name);
	}
}
