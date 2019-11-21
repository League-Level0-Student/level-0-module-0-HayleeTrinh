package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "Hey! What's your name?");
		JOptionPane.showMessageDialog(null, "Ah! I know you ate food and stuff, " + name + ". Cus that's what humans do!");
		JOptionPane.showMessageDialog(null, "Unless...");
	}
}
