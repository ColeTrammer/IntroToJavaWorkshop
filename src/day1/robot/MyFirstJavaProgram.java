package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot c3 = new Robot();

		c3.sparkle();

		c3.penDown();
		c3.setSpeed(5);
		c3.setRandomPenColor();
		for (int i = 0; i < 10; i++) {

			c3.move(50);
			c3.turn(36);
			c3.turn(-90);
		}

	}
}
