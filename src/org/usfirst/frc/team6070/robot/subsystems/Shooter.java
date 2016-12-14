package org.usfirst.frc.team6070.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6070.robot.RobotMap;

import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class Shooter extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor mainMotor = new Victor (RobotMap.shooterPort);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void moveit(double x)
    {
    	mainMotor.set(x*0.3);
    }
    public void stop()
    {
    	mainMotor.set(0);
    }
}

