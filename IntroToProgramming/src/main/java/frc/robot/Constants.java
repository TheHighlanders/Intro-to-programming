// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int XBOX_PORT = 0;
    public static final int CONTROL2_PORT = 2;
    public static final int CONTROL3_PORT = 1;
    
    public static final int LEFT_WHEELS_1 = 41;//victor 
    public static final int LEFT_WHEELS_2 = 51;//talon
    public static final int RIGHT_WHEELS_1 = 44;//victor 
    public static final int RIGHT_WHEELS_2 = 50;//talon

    public static final int INTAKE_ARM = 52;

    //Intakebrush has port number 54
    public static final int INTAKE_BRUSH = 54;
    //Conveyor has 46
    public static final int CONVEYOR = 46;


    // Button Constants
    // Control 3
    // Control 1 on driver statoin
    public static final int ARM_UP_BUTTON = 6;
    public static final int ARM_DOWN_BUTTON = 7;


    // Control 2
    //Intake In (brushes) is button 2
    //Intake Out (brushes) is button 1
    public static final int INTAKE_BRUSH_IN = 2;
    public static final int INTAKE_BRUSH_OUT = 1;
    
    //ConveryorIn is button 4
    //ConveryorOut is button 3
    public static final int CONVEYOR_IN = 4;
    public static final int CONVEYOR_OUT = 3;
}
