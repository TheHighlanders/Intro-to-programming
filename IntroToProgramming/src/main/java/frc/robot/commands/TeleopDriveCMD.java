// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.OI;
import frc.robot.subsystems.Drive;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TeleopDriveCMD extends CommandBase {
  /** Creates a new TeleopDriveCMD. */
  private final Drive m_Drive;
  private final OI m_OI;
  public TeleopDriveCMD(Drive drive_subsystem,OI xbox_oi) {
  m_Drive = drive_subsystem;
  m_OI = xbox_oi;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Drive.drivePower(-this.m_OI.getXboxLeftY(), -this.m_OI.getXboxRightY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
