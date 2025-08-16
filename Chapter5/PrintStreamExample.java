/*
===============================================================================
 Title   : PrintStream Console Output
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates printing to console using PrintStream.
===============================================================================
*/

import java.io.PrintStream;

public class PrintStreamExample 
{
    public static void main(String[] args) 
    {
        PrintStream ps = System.out; // Console output stream

        ps.println("Hello from PrintStream!");
        ps.print("This is without newline. ");
        ps.println("This is with newline.");

        /*
         Exercises:
         1. Use ps.printf() to format output.
         2. Redirect PrintStream to a file.
        */
    }
}
