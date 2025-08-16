/*
===============================================================================
 Title   : Scanner Integer Input
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates reading an integer from user using Scanner class.
===============================================================================
*/

import java.util.Scanner;

public class ScannerIntInput 
{
    public static void main(String[] args) 
    {
        // Create Scanner object to read input from console
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // Reads integer input

        System.out.println("You entered: " + num);  // Display entered integer

        sc.close();  // Close the scanner to free resources

        /*
         Exercises:
         1. Read two integers and print their sum.
         2. Try entering a non-integer value and observe error.
        */
    }
}
