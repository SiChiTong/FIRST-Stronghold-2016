package org.usfirst.frc.team293.robot.commands;

import org.usfirst.frc.team293.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftCenterWheel extends Command {		//Toggles the Drivetrain Center Wheel up and down with a button press
	private static boolean up = false;
    public LiftCenterWheel() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lifterdrivetrain);
    	requires(Robot.ledCenterWheel);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.ledCenterWheel.on();
    	if(Robot.lifterdrivetrain.isUp()){
    		up = false;
    	}else if(Robot.lifterdrivetrain.isDown()){
    		up = true;
    	}else{
    		up=!up;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.ledCenterWheel.flash();
    	if(up){
    		Robot.lifterdrivetrain.lift();
    	}else{
    		Robot.lifterdrivetrain.drop();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(up){
    		return Robot.lifterdrivetrain.isUp();
    	}else{
    		return Robot.lifterdrivetrain.isDown();
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ledCenterWheel.off();
    	Robot.lifterdrivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
