// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DriverStation;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;

public class Drive extends SubsystemBase {
  /** Creates a new Drive. */
  public WPI_TalonSRX left1;
  public WPI_VictorSPX left2;
  public WPI_TalonSRX right1;
  public WPI_VictorSPX right2;
  private double ramp = 0.2;
  
  public OI xbox_io;
  public Drive() {
    left1 = new WPI_TalonSRX(Constants.LEFT_WHEELS_1);
    left2 = new WPI_VictorSPX(Constants.LEFT_WHEELS_2);
    right1 = new WPI_TalonSRX(Constants.RIGHT_WHEELS_1);
    right2 = new WPI_VictorSPX(Constants.RIGHT_WHEELS_2);

    left1.configOpenloopRamp(ramp,0);
    left2.configOpenloopRamp(ramp,0);
    right1.configOpenloopRamp(ramp,0);
    right2.configOpenloopRamp(ramp,0);
    
    left1.setNeutralMode(NeutralMode.Coast);
    left2.setNeutralMode(NeutralMode.Coast);
    right1.setNeutralMode(NeutralMode.Coast);
    right2.setNeutralMode(NeutralMode.Coast);

    xbox_io = new OI();
    left2.follow(left1);
    right2.follow(right1);
  }
  public void drivePower(double left_power, double right_power){
    left1.set(left_power);
    right1.set(right_power);
  }
  public void stopPower(){
    drivePower(0,0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
