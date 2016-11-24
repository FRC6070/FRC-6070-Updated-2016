package org.usfirst.frc.team6070.robot.commands;

import org.usfirst.frc.team6070.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *	Auto-Moving forwawrd
 */
public class Auto1Command extends Command {

    double x, y, z;
    int g;
	public Auto1Command(double x, double y, double z, int g) 
    {
        requires(Robot.DriveBase);
        this.x = x;
        this.y = y;
        this.z = z;
        this.g = g;
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	Robot.DriveBase.drive(this.y, this.z);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
