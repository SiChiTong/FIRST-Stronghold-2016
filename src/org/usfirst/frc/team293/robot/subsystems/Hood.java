package org.usfirst.frc.team293.robot.subsystems;

import org.usfirst.frc.team293.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Hood extends Subsystem {
	private CANTalon Hood;

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public Hood() {
		super();
		Hood = new CANTalon(RobotMap.hoodMotor);
		Hood.changeControlMode(TalonControlMode.Position);
		Hood.setFeedbackDevice(FeedbackDevice.AnalogPot);
		Hood.setPID(3, 0.001, 0.0); // Set the PID constants (p, i, d)

		Hood.enableControl(); // Enable PID control on the talon
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void setsetpoint(double setpoint) {
		Hood.set(setpoint);
	}
}