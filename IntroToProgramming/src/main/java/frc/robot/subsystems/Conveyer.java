// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.OI;
import com.ctre.phoenix.motorcontrol.NeutralMode;
public class Conveyer extends SubsystemBase {
  
  ////////
    /**
   * Creates a new IntakeAuto.
   */
  private WPI_TalonSRX Conveyer = new WPI_TalonSRX(Constants.CONVEYER);
  private double ramp = 0.2;
  public OI intake_io;
  public Conveyer() {
    Conveyer.configOpenloopRamp(ramp,0);
    Conveyer.setNeutralMode(NeutralMode.Brake);

    intake_io = new OI();

  }

  public void ConveyerIn(double speed){
    Conveyer.set(speed);
  }

public void ConveyerOut(){
  Conveyer.set(1);
}
public void ConveyerStop(){
  Conveyer.set(0);
}

  @Override
  public void periodic() {

  }
}
