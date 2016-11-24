package org.usfirst.frc.team6070.robot.commands;

import org.usfirst.frc.team6070.robot.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class HIT_THE_FLOOR extends Command {

    double a;
	public HIT_THE_FLOOR(double x) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		// passes a speed as x
    	requires(Robot.Arm);
    	this.a = x;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Arm.moveit(a);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
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
