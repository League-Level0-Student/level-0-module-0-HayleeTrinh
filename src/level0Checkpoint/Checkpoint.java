package level0Checkpoint;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog(null, "Hello! What's you favorite color out of the rainbow?");
	JOptionPane.showMessageDialog(null, "Cool! My favorite color is also " + color + "!");
	//triangle
	Robot tri = new Robot();
	tri.penDown();
	tri.setSpeed(50);
	
	//triangle color
		if(color.equalsIgnoreCase("red")) {
			tri.setPenColor(255, 4, 0);
		}
		if(color.equalsIgnoreCase("blue")) {
			tri.setPenColor(0, 42, 255);
		}
		if(color.equalsIgnoreCase("orange")) {
			tri.setPenColor(255, 119, 0);
		}
		if(color.equalsIgnoreCase("yellow")) {
			tri.setPenColor(255, 251, 0);
		}
		if(color.equalsIgnoreCase("green")) {
			tri.setPenColor(9, 255, 0);
		}
		if(color.equalsIgnoreCase("purple")) {
			tri.setPenColor(106, 0, 255);
		}
		
	//shape
	for (int i = 0; i < 3; i++) {
		tri.move(200);
		tri.turn(120);
	}
}
}
