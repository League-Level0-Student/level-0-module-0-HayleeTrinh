package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hello umm... What's your name again?");
		JOptionPane.showMessageDialog(null,"Ah! Yes yes! Hello " + name + "!");
	}
}
