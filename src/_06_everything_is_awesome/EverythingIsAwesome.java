package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String joe = JOptionPane.showInputDialog(null, "Hey! What do you like?");
		JOptionPane.showMessageDialog(null, "I agree! " + joe + " is awesome!" );
	}
}
