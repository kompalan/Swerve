package org.usfirst.frc.team548.robot;

import edu.wpi.first.wpilibj.Joystick;

public class XboxController extends Joystick{
	
	public XboxController(int port) {
		super(port);
	}
	
	public void setLeftRumble(double rumble) {
		this.setRumble(Joystick.RumbleType.kLeftRumble, (float)rumble);
	}
	
	public void setRightRumble(double rumble) {
		this.setRumble(Joystick.RumbleType.kRightRumble, (float)rumble);
		
	}
	
	public double getLeftStickXAxis() {
		return getRawAxis(0);
		//return this.getLeftStickXAxis();
	}
	
	public double getLeftStickYAxis() {
		return -getRawAxis(1);
		//return this.getLeftStickYAxis();
	}
	
	public double getRightTriggerAxis() {
		return getRawAxis(3);
		//return this.getRightTriggerAxis();
	}
	
	public double getLeftTriggerAxis() {
		return getRawAxis(2);
		//return this.getLeftTriggerAxis();
	}
	
	public double getRightStickXAxis() {
		return getRawAxis(4);
		//return this.getRightStickXAxis();
	}
	
	public double getRightStickYAxis() {
		return -getRawAxis(5);
		//return this.getRightStickYAxis();
	}

	public boolean getAButton() {
		return getRawButton(1);
		//return this.getAButton();
	}

	public boolean getBButton() {
		return getRawButton(2);
		//return this.getBButton();
	}

	public boolean getXButton() {
		return getRawButton(3);
		//return this.getXButton();
	}

	public boolean getYButton() {
		return getRawButton(4);
		//return this.getYButton();
	}

	public boolean getLeftBumper() {
		return getRawButton(5);
		//return this.getLeftBumper();
	}

	public boolean getRightBumper() {
		return getRawButton(6);
		//return this.getRightBumper();
	}

	public boolean getBackButton() {
		return getRawButton(7);
		//return this.getRightBumper();
	}

	public boolean getStartButton() {
		return getRawButton(8);
		//return this.getStartButton();
	}
	
	public boolean getLeftJoystickButton() {
		return getRawButton(9);
		//return this.getLeftJoystickButton();
	}
	
	public boolean getRightJoystickButton() {
		return getRawButton(10);
		//return this.getRightJoystickButton();
	}
	
	public boolean getRightTriggerButton() {
		if(getRightTriggerAxis() > 0.5) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean getLeftTriggerButton() {
		if(getLeftTriggerAxis() > 0.5) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getDPad() {
		return getPOV();
		//return this.getPOV();
	}
	
	public boolean isDPadTopHalf() {
		if(getDPad() == 315 || getDPad() == 0 || getDPad() == 45) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isDPadBottomHalf() {
		if(getDPad() == 135 || getDPad() == 180 || getDPad() == 225) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBothTriggerAxis() {
		return (getRightTriggerAxis()-getLeftTriggerAxis());
	}
	
	public double getTriggers() {
		return (this.getRawAxis(3)-this.getRawAxis(2));
		//return (this.getX()-this.getY());
	}
	
}