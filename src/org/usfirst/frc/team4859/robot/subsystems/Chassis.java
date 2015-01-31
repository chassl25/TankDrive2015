package org.usfirst.frc.team4859.robot.subsystems;

import org.usfirst.frc.team4859.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *Court
 */
public class Chassis extends Subsystem
{
	SpeedController leftMotor, rightMotor;
	RobotDrive drive; //drive command- import RobotDrive from wpilib
	Encoder encoderLeft;
	Encoder encoderRight;
	
	public Chassis()
	{
		super();
		//# is written on the bottom on the CANTalon and configured in Roborio
    	leftMotor = new CANTalon(12);
    	rightMotor = new CANTalon(14);
    	drive = new RobotDrive(leftMotor, rightMotor);
    	drive.setSafetyEnabled(true); // if code goes too long this will stop the code
    	drive.setExpiration(1); // time until code stops?
    	//Encoder encoderLeft;
    	encoderLeft = new Encoder(0,1,false,Encoder.EncodingType.k4X);
    	encoderRight = new Encoder(2,3,false,Encoder.EncodingType.k4X);
    	//encoderLeft.setMaxPeriod(.1);
    	//encoderRight.setMaxPeriod(.1);
    	//encoderLeft.setMinRate(10);
    	//encoderRight.setMinRate(10);
    	//encoderLeft.setDistancePerPulse(5);
    	//encoderRight.setDistancePerPulse(5);
    	//encoderLeft.setReverseDirection(true);
    	//encoderRight.setReverseDirection(true);
    	//encoderLeft.setSamplesToAverage(7);
    	//encoderRight.setSamplesToAverage(7);
    	
    	
    	
    }

	
    public void initDefaultCommand()
    {
    	/*Encoder encoderLeft;
    	Encoder encoderRight;
    	encoderLeft = new Encoder(0,1,false,Encoder.EncodingType.k4X);
    	encoderRight = new Encoder(2,3,false,Encoder.EncodingType.k4X);
    	encoderLeft.setMaxPeriod(.1);
    	encoderRight.setMaxPeriod(.1);
    	encoderLeft.setMinRate(10);
    	encoderRight.setMinRate(10);
    	encoderLeft.setDistancePerPulse(5);
    	encoderRight.setDistancePerPulse(5);
    	encoderLeft.setReverseDirection(true);
    	encoderRight.setReverseDirection(true);
    	encoderLeft.setSamplesToAverage(7);
    	encoderRight.setSamplesToAverage(7);
    	int count =encoderLeft.get();
    	int count = encoderRight.get();
    	double distance = encoderLeft.getRaw();
    	double distance = encoderRight.getRaw();
    	double distance = encoderLeft.getDistance();k
    	double distance = encoderRight.getDistance();
    	double period = encoderLeft.getPeriod();
    	double period = encoderRight.getPeriod();
    	double rate = encoderLeft.getRate();
    	double rate = encoderRight.getRate();
    	boolean direction = encoderLeft.getDirection();
    	boolean direction = encoderRight.getDirection();
    	boolean stopped = encoderLeft.getStopped();
    	boolean stopped = encoderRight.getStopped();
    	
    	encoderLeft.reset();
    	encoderRight.reset();
    */
    }
    
    
    
    public void driveWithJoystick(Joystick left, Joystick right)
    {
    	double leftSpeed = -(left.getY()/2);
    	double rightSpeed = right.getY()/2;
    	
    	drive.tankDrive(leftSpeed, rightSpeed);
    }
}

