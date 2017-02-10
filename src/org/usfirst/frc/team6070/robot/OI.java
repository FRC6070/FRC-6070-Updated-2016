package org.usfirst.frc.team6070.robot;

import org.usfirst.frc.team6070.robot.commands.SPIN;
import org.usfirst.frc.team6070.robot.commands.startDriving;
import org.usfirst.frc.team6070.robot.commands.stopDriving;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick stick;
	public static Button button;
	public static Button spinButton;
	
	
	public OI (){
		
		stick = new Joystick (1);
		button = new JoystickButton (stick, 2);
		spinButton = new JoystickButton (stick, 3);
		
		
		button.whileHeld(new stopDriving());
		button.cancelWhenActive(new startDriving());
		
		spinButton.whileHeld(new SPIN());
		spinButton.cancelWhenActive(new startDriving());
		
		
		
		}
	
	public static double driveX (){
		if (stick.getX() <= 0.1){
			return 0;
		}else{
			return stick.getX();
		}
	}
	
	public static double driveY (){
		if (stick.getY() <= 0.1){
			return 0;
		}else{
			return stick.getY();
		}
	}
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
