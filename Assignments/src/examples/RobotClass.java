package examples;

import java.awt.AWTException;
import java.awt.Robot;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot r = new Robot();
		for (int i = 1; i<100;i=i+10){
			r.mouseMove(50+i,100);
			Thread.sleep(500);
		}
	}

}
