package org.usfirst.frc.team6070.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6070.robot.RobotMap;

import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class ShovelSmacker extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor motor = new Victor (RobotMap.Armmotor);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void moveit(double x)
    {
    	motor.set(x*0.3);
    }
    public void stop()
    {
    	motor.set(0);
    }
}

