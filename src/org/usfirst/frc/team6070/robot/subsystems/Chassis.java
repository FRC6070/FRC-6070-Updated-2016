package org.usfirst.frc.team6070.robot.subsystems;

import org.usfirst.frc.team6070.robot.RobotMap;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.*;

/**
 *
 */
public class Chassis extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor LF = new Victor(RobotMap.leftFront);
	Victor LB = new Victor(RobotMap.leftBack);
	Victor RF = new Victor(RobotMap.RightFront);
	Victor RB = new Victor(RobotMap.RightBack);
	RobotDrive drive = new RobotDrive(LB, LF, RB, RF);
    public void initDefaultCommand() {
    	drive.setInvertedMotor(MotorType.kFrontLeft, true);
    	drive.setInvertedMotor(MotorType.kRearLeft, true);
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void drive(double y, double z)
    {
    	drive.arcadeDrive(y, z);
    }
    public void stop()
    {
    	drive.arcadeDrive(0,0);
    }
    public void circleOfDeath()
    {
    	drive.arcadeDrive(0,1);
    }
}

