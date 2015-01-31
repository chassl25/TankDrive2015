
package org.usfirst.frc.team4859.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team4859.robot.commands.Autonomous;
import org.usfirst.frc.team4859.robot.subsystems.Chassis;


public class Robot extends IterativeRobot
{

	public static Chassis chassis = new Chassis();
	
	public static OI oi;

	Command autonomousCommand;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit()
    {
		oi = new OI();
		
		autonomousCommand = new Autonomous();
        
    }
	
    public void autonomousInit()
    {
        autonomousCommand.start();
    }
    
    
    public void autonomousPeriodic()
    {
        Scheduler.getInstance().run();
    }
    
    public void teleopInit()
    {
        autonomousCommand.cancel();
    }
    
    
    public void teleopPeriodic()
    {
        Scheduler.getInstance().run();
    }
    
    
    public void testPeriodic()
    {
        LiveWindow.run();
    }
}
