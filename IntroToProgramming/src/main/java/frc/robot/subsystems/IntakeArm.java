/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DriverStation;

public class IntakeArm extends SubsystemBase {
  /**
   * Creates a new IntakeAuto.
   */
  private WPI_VictorSPX intakeArm = new WPI_VictorSPX(Constants.INTAKE_ARM);
  public IntakeArm() 
  {
    
  }
  public void ArmUp() 
  {
    intakeArm.set(-1);
  }
  public void ArmDown() 
  {
    intakeArm.set(1);
  }
  public void armStop() 
  {
    intakeArm.set(0);
  }

  @Override
  public void periodic() 
  {

  }
}
