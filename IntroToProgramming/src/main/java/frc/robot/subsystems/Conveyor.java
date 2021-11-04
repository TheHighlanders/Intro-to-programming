// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.OI;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Conveyor extends SubsystemBase {
  /** Creates a new conveyor. */
  private WPI_TalonSRX conveyorMotor = new WPI_TalonSRX(Constants.CONVEYOR);
  private double ramp = 0.2;
  public OI intake_io;


  public Conveyor() {
    conveyorMotor.configOpenloopRamp(ramp,0);
    conveyorMotor.setNeutralMode(NeutralMode.Brake);


    intake_io = new OI();

  }

  public void ConveyorIn(double speed) {
    conveyorMotor.set(speed);

  }
  
  public void ConveyorOut() {
    conveyorMotor.set(1);

  }

  public void ConveyorSTOP() {
    conveyorMotor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
