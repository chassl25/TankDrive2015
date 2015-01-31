package org.usfirst.frc.team4859.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
    Joystick left = new Joystick(0);
    Joystick right = new Joystick(1);
   
    public OI(){}
    
    
    public Joystick getLeftJoystick ()
    {
    	return left;
    }
    
    
    public Joystick getRightJoystick ()
    {
    	return right;
    }
}

