package org.usfirst.frc.team293.robot.commands;

import org.usfirst.frc.team293.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class pdpLogging extends Command {

    public pdpLogging() {
        // Use requires() here to declare subsystem dependencies
         requires(Robot.logging);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    //	Robot.logging.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    //	Robot.logging.log();
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
