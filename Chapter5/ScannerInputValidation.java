/*
===============================================================================
 Title   : Scanner Input Validation
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates input validation using try-catch for Scanner.
===============================================================================
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerInputValidation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            sc.close();
        }

        /*
         Exercises:
         1. Try reading multiple numbers with validation in a loop.
         2. Combine with arithmetic operations after validation.
        */
    }
}
