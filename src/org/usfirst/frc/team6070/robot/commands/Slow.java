package org.usfirst.frc.team6070.robot.commands;

import org.usfirst.frc.team6070.robot.*;
import org.usfirst.frc.team6070.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Slow extends Command {

    double x;
	public Slow() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
		// passes a speed as x
    	requires(Robot.shooter);
    	x = Shooter.slow;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called respeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.moveIt(x);
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
