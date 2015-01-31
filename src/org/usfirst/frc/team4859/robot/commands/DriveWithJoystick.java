package org.usfirst.frc.team4859.robot.commands;

import org.usfirst.frc.team4859.robot.Robot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;


public class DriveWithJoystick extends Command {
	public RobotDrive drive;

    public DriveWithJoystick()
    {
    	requires(Robot.chassis);
    }

    protected void initialize() {}

    protected void execute()
    {
    	Robot.chassis.driveWithJoystick(Robot.oi.getLeftJoystick(),Robot.oi.getRightJoystick());
    }

    protected boolean isFinished()
    {
        return false;
    }

    protected void end()
    {
    	//Robot.chassis.RobotDrive(0,0);
    }

    protected void interrupted()
    {
    	end();
    }
}
