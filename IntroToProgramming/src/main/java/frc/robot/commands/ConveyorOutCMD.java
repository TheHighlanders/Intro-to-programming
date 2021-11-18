// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Conveyor;
public class ConveyorOutCMD extends CommandBase {
  public final Conveyor m_Conveyor;

  /** Creates a new ConveyorOutCMD. */
  public ConveyorOutCMD(Conveyor conveyor_subsystem) {
    m_Conveyor = conveyor_subsystem;
    addRequirements(m_Conveyor);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_Conveyor.ConveyorOut();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Conveyor.ConveyorSTOP();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}