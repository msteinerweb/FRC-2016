
package org.usfirst.frc.team6022.robot.subsystems;

import org.usfirst.frc.team6022.robot.commands.DriveWithLogitech;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveShaft extends Subsystem {

	static RobotDrive drive = new RobotDrive(0,1,2,3); //4 motor drive
	
	public DriveShaft()
	{
		super();
	}
	public void initDefaultCommand () {
		setDefaultCommand (new DriveWithLogitech());}
	
		public void DriveWithLogitech(Joystick joystick) {
			drive.arcadeDrive(joystick.getY()*1,(-joystick.getTwist()*.75));
			
		
		{
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		
	}
}
}

