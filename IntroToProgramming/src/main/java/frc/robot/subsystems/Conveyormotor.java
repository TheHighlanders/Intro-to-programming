// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
public class Conveyormotor extends SubsystemBase {
  /** Creates a new Conveyormotor. */
  private WPI_TalonSRX Conveyor = new WPI_TalonSRX(Constants.CONVEYOR);
  private double ramp = 0.2;
  public OI intake_io;
  public Conveyormotor() {
    
    
    
    Conveyor.configOpenloopRamp(ramp,0);
    Conveyor.setNeutralMode(NeutralMode.Brake);
    intake_io = new OI(); 
  }
  public void ConveyorIN(double speed) {
    Conveyor.set(speed);
  }
  public void ConveyorOUT() {
    Conveyor.set(1);
  }
  public void ConveyorSTOP() {
    Conveyor.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
