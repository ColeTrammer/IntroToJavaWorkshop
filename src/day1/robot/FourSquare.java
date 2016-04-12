package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot c3 = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		c3.setSpeed(10);
		// 5. Set the pen width to 5
		c3.setPenWidth(5);
		c3.penDown();
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 1000000000L; i++) {

			// 7. Set the pen color to random
			// 1. Call the drawSquare() method
			drawSquare(i * 2);
			// 8. Turn the robot 90 degrees to the right
			c3.turn(359 / 10);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare(int length) {
		for (int i = 0; i < 4; i++) {

			c3.setRandomPenColor();
			c3.move(length);
			c3.turn(89);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
