package org.usfirst.frc.team6070.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6070.robot.RobotMap;

import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.*;

/**
 *
 */
public class Shooter extends Subsystem {
    
	public static double slow = 0.5;
	public static double medium = 0.8;
	public static double fast = 1.0;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor mainMotor = new Victor (RobotMap.shooterPort);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void moveIt(double x) {
    	mainMotor.set(x);
    }
    
//    public void slow() {
//    	moveIt(slow1);
//    }
//    public void medium() {
//    	moveIt(medium);
//    }
//    public void fast() {
//    	moveIt(fast);
//    }
    public void stop()
    {
    	mainMotor.set(0);
    }
}

