/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.*;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;



/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  /*
    Template: 
    private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
    private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  */
  private final OI m_OI = new OI();
  //private final Drive m_robotDrive = new Drive();
  private final IntakeArm m_IntakeArm = new IntakeArm();
  private Command m_autoCommand;
  

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
   configureButtonBindings();
   // m_autoCommand = new AlignCmd(m_robotDrive);
    // m_autoCommand = new AutoGroup("Back",m_robotDrive, m_Shooting, m_Conveyor, m_IntakeBrush);  
    
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    
    //Joystick joystick2 = new Joystick(Constants.CONTROL2_PORT);
    //Joystick joystick3 = new Joystick(Constants.CONTROL3_PORT);

    // Xbox is Controller #1 (In Port 1)
    // Left side of the Control Panel is Controller #3 (In Port 3)
    // Right side of the Control Panel is Controller #2 (In Port 2)

    /*
      Controller #3
      Moving the Intake Arm up and down (Called Intake Up and Down on the Panel)
    */
    JoystickButton ArmUp = new JoystickButton(m_OI.Control3,Constants.ARM_UP_BUTTON);
    JoystickButton ArmDown = new JoystickButton(m_OI.Control3,Constants.ARM_DOWN_BUTTON);
    ArmUp.whileHeld(new IntakeArmUpCMD(m_IntakeArm));
    ArmDown.whileHeld(new IntakeArmDownCMD(m_IntakeArm));
    
    /*
      Controller #2
      Intake in and out (Called Intaker IN and OUT on the Panel)
    */
    
    /*
      Controller #2
      Conveyor in and out
    */

    /*
      Controller #1 Xbox
    */
    JoystickButton xboxD = new JoystickButton(m_OI.xbox,4); //IntakeArm
    JoystickButton xboxLeftBumper = new JoystickButton(m_OI.xbox, 5);
    JoystickButton xboxRightBumper = new JoystickButton(m_OI.xbox, 6);

    xboxD.whileHeld(new IntakeArmUpCMD(m_IntakeArm));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */ 
  
  
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
     return m_autoCommand;
     
  } 
}
