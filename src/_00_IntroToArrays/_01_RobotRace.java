package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		//2. create an array of 5 robots.
		Robot[] r = new Robot[7];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i < r.length; i++) {
			//4. make each robot start at the bottom of the screen, side by side, facing up
			r[i] = new Robot((120*i + 200), 500);
			r[i].setAngle(0);
			r[i].setSpeed(10);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		boolean t = false;
		while(!t) {
	    	for(int i = 0; i < r.length && !t; i++) {
	    		r[i].move(new Random().nextInt(50));
	    		if(r[i].getY() <= 0) {
	    			t = true;
	    			System.out.println("Robot #" + (i+1) + " won!");
	    		}
	    	}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
