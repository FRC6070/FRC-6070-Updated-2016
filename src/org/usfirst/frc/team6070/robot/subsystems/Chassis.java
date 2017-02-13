package org.usfirst.frc.team6070.robot.subsystems;

import org.usfirst.frc.team6070.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
	
	Victor BL = new Victor (RobotMap.BackLeft);
	Victor BR = new Victor (RobotMap.BackRight);
	Victor FL = new Victor (RobotMap.FrontLeft);
	Victor FR = new Victor (RobotMap.FrontRight);
	
	RobotDrive drive = new RobotDrive(BL, BR, FL, FR);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	drive.setInvertedMotor(MotorType.kFrontRight, true);
    	drive.setInvertedMotor(MotorType.kRearRight, true);
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive(double y, double x){
    	drive.arcadeDrive(y, x);
    	
    }
    
    public void stop (){
    	drive.arcadeDrive(0, 0);
    }
    
    public void spin(){
    	drive.arcadeDrive(0, 1);
    }
}

