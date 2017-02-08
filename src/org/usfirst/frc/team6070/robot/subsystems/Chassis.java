package org.usfirst.frc.team6070.robot.subsystems;

import org.usfirst.frc.team6070.robot.RobotMap;
import org.usfirst.frc.team6070.robot.commands.START_DRIVING_GODDAMNIT;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.interfaces.Gyro;

import org.usfirst.*;

/**
 *
 */
public class Chassis extends Subsystem {
    
		
		Victor LF = new Victor (RobotMap.leftFront);
		Victor LB = new Victor (RobotMap.leftBack);
		Victor RF = new Victor (RobotMap.RightFront);
		Victor RB = new Victor (RobotMap.RightBack);
		
		RobotDrive drive = new RobotDrive (LF, LB, RF, RB);
		
		public boolean reverse = false;
		 
		Accelerometer accel = new BuiltInAccelerometer(Accelerometer.Range.k4G);
		double acc = 0;
		double vel = 0;
		double dist = 0;
		double anglefix;
		
		double kp = 0.7;
		
		Gyro gyro = new AnalogGyro(0);
		
	    // Put methods for controlling this subsystem
	    // here. Call these from Commands.

	    public void initDefaultCommand() {
	    	drive.setInvertedMotor(MotorType.kFrontRight, true);
	    	drive.setInvertedMotor(MotorType.kRearRight, true);
	    	gyro.reset();
	    	
	    	
	        // Set the default command for a subsystem here.
	        //setDefaultCommand(new MySpecialCommand());
	    	setDefaultCommand(new START_DRIVING_GODDAMNIT());
	    }
	    
	 
	    public void drive (double y, double z){
	    	drive.arcadeDrive(y, z);
	    }
	    public void drive (double y, double z, boolean a)
	    {
	    	drive.tankDrive(y, z);
	    }
	    
	    public void setdirection()
	    {
	    	anglefix = gyro.getAngle();
	    }
	    public void drivestraight(double dist)
	    {
	    	double speed;
	    	boolean done = false;
	    	while (!done)
	    	{
	    		if (dist - this.dist > 5)
	        	{
	        		speed = 1.0;
	        	}
	        	else if (dist - this.dist < 0.1)
	        	{
	        		speed = 0.0;
	        		done = true;
	        	}
	        	else
	        	{
	        		speed = (dist - this.dist)*kp;
	        	}
	        	double driveangle = gyro.getAngle();
	        	drive.arcadeDrive(speed, (anglefix-driveangle)*kp);
	        	this.updateaccel();
	    	}
	    	
	    }
	    
	    public void updateaccel()
	    {
	    	acc = accel.getX()*32.2;
	    	vel += acc;
	    	dist += vel;
	    }
	    
	    public void stop (){
	    	
	    	drive.arcadeDrive(0, 0);
	    }
	    
	    public void spin (){
	    	
	    	drive.arcadeDrive(0, 1);
	    }
	    public void turnPID(double angle)
	    {
	    	boolean done = false;
	    	while (!done)
	    	{
	    		double ang = (gyro.getAngle() % 360);
	    		if (angle-ang < 1)
	    		{
	    			done = true;
	    		}
	    		drive.arcadeDrive(0, ((angle-ang)/(angle-anglefix))*kp);
	    	}
	    }
	    public void resetAccel()
	    {
	    	acc = 0;
	    	vel = 0;
	    	dist = 0;
	    	anglefix = 0;
	    }
	    public void resetGyro()
	    {
	    	gyro.reset();
	    }
	}

