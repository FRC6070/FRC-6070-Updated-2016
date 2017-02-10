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
	
	Victor BL = new Victor (RobotMap.backLeft);
	Victor BR = new Victor (RobotMap.backRight);
	Victor FL = new Victor (RobotMap.frontLeft);
	Victor FR = new Victor (RobotMap.frontright);
	
	RobotDrive drive = new RobotDrive (BL, BR, FL, FR);
	
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	drive.setInvertedMotor(MotorType.kFrontLeft, true);
    	drive.setInvertedMotor(MotorType.kRearRight, true);

    		
    	}
    public void drive(double y, double z){
    	drive.arcadeDrive(y, z);
    	
    }
    
    public void stop (){
    	drive.arcadeDrive(0, 0);
    	
    }
    
    public void spin (){
    	drive.arcadeDrive(0, 1);
    }
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }


