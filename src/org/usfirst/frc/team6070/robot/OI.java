package org.usfirst.frc.team6070.robot;

import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.vision.*;
import org.usfirst.frc.team6070.robot.commands.*;
import edu.wpi.first.wpilibj.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	static Joystick stick;
	static Joystick arm;
	static Button button;
	static Button button1;
	
	public OI()
	{
		stick = new Joystick(0);
		arm  = new Joystick(1);
		button = new JoystickButton(stick, 1);
		button1 = new JoystickButton(stick, 2);
		
		button.whenReleased(new START_DRIVING_GODDAMNIT());
		button.whileHeld(new Donuts());
		button1.whileHeld(new HIT_THE_FLOOR(0.3));
	}
	public static boolean button1()
	{
		return stick.getRawButton(2);
	}
	
	public static double ArmY()
	{
		if (Math.abs(arm.getY()) < 0.1)
		{
			return 0;
		}
		else
		{
			return arm.getY();
		}
	}
	
	public static double getDriveX()
	{
		if (Math.abs(stick.getX()) < 0.1)
		{
			return 0;
		}
		else
		{
			return stick.getX();
		}
	}
	public static double getDriveY()
	{
		if (Math.abs(stick.getY()) < 0.1)
		{
			return 0;
		}
		else
		{
			return stick.getY();
		}
	}
	public static double getDriveZ()
	{
		if (Math.abs(stick.getZ()) < 0.1)
		{
			return 0;
		}
		else
		{
			return stick.getZ();
		}
	}
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
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
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

