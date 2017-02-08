package org.usfirst.frc.team6070.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 */
public class Shooter extends Subsystem {
	
	Talon BL4 = new Talon (4);
	
	static double slow = 0.5;
	static double medium = 0.8; 
	static double fast = 1.0;
	
	double currentSpeed = 0.75;
	
	Joystick joystick = new Joystick (0);
	
	Button buttonOne = new JoystickButton (joystick, 0);
	Button buttonTwo = new JoystickButton (joystick, 1);
	Button buttonThree = new JoystickButton (joystick, 2);
	
	public void fastSpeed() {
		currentSpeed = fast;
	}
	
	public void mediumSpeed(){
		currentSpeed = medium;
		
	}
	
	public void slowSpeed(){
		currentSpeed = slow; 
		
	}
	
	public void stop (){
		currentSpeed = 0;
		
	}
	
	public double turnX(){
		return joystick.getX();
		
	}
	
	public double turnY(){
		return joystick.getY();
	}

	/*
	 *one motor
	 *1 talon -> 4
	 * 3 funcs
	 * 	fast, medium, slow
	 * fast = 1.0 speed
	 * medium = 0.8 speed
	 * slow = 0.5
	 * able to turn
	 * stop = 0
	 * 
	 * controlled by 3 joystick buttons
	 * 
	 * 
	 * */
	/*(non-Javadoc)
	 * @see edu.wpi.first.wpilibj.command.Subsystem#initDefaultCommand()
	 */
	
	
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

