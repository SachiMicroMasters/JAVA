/*
===============================================================================
 Title   : Scanner Float and Double Input
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates reading float and double values using Scanner.
===============================================================================
*/

import java.util.Scanner;

public class ScannerFloatDouble 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float f = sc.nextFloat();  // Reads float

        System.out.print("Enter a double number: ");
        double d = sc.nextDouble();  // Reads double

        System.out.println("Float: " + f + ", Double: " + d);

        sc.close();

        /*
         Exercises:
         1. Multiply float and double values and print result.
         2. Try using nextInt() instead of nextFloat() and see what happens.
        */
    }
}
