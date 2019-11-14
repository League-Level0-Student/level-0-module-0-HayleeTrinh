package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) throws Exception {
		Robot chad = new Robot();
		chad.moveTo(25, 400);
		//H
		chad.penDown();
		chad.setSpeed(25);
		chad.move(200);
		chad.turn(180);
		chad.move(100);
		chad.microTurn(-90);
		chad.move(100);
		chad.microTurn(90);
		chad.move(100);
		chad.microTurn(-180);
		chad.move(200);
		//A
		chad.microTurn(90);
		chad.penUp();
		chad.move(50);
		chad.microTurn(90);
		chad.penDown();
		chad.move(200);
		chad.microTurn(180);
		chad.move(200);
		chad.microTurn(90);
		chad.move(100);
		chad.microTurn(90);
		chad.move(200);
		chad.turn(180);
		chad.move(100);
		chad.microTurn(-90);
		chad.move(100);
		//Y
		chad.penUp();
		chad.microTurn(180);
		chad.move(250);
		chad.penDown();
		chad.microTurn(90);
		chad.move(100);
		chad.microTurn(180);
		chad.move(200);
		chad.microTurn(180);
		chad.move(100);
		chad.microTurn(90);
		chad.move(100);
		chad.microTurn(90);
		chad.move(100);
		//L
		chad.penUp();
		chad.microTurn(90);
		chad.move(150);
		chad.penDown();
		chad.microTurn(90);
		chad.move(200);
		chad.microTurn(-90);
		chad.move(100);
		//E1
		chad.penUp();
		chad.move(50);
		chad.penDown();
		chad.move(100);
		chad.microTurn(180);
		chad.move(100);
		chad.microTurn(90);
		chad.move(200);
		chad.microTurn(90);
		chad.move(100);
		chad.microTurn(180);
		chad.move(100);
		chad.microTurn(-90);
		chad.move(100);
		chad.microTurn(-90);
		chad.move(100);
		//E2
		chad.penUp();
		chad.microTurn(90);
		chad.move(100);
		chad.turn(-90);
		chad.move(50);
		chad.penDown();
		chad.move(100);
		chad.microTurn(180);
		chad.move(100);
		chad.microTurn(90);
		chad.move(200);
		chad.microTurn(90);
		chad.move(100);
		chad.microTurn(180);
		chad.move(100);
		chad.microTurn(-90);
		chad.move(100);
		chad.microTurn(-90);
		chad.move(100);
		
		
		
		
		
		
		
	}
}
