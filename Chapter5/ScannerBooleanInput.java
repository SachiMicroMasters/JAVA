/*
===============================================================================
 Title   : Scanner Boolean Input
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates reading boolean input using Scanner.
===============================================================================
*/

import java.util.Scanner;

public class ScannerBooleanInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you like Java? (true/false): ");
        boolean answer = sc.nextBoolean();

        if(answer) {
            System.out.println("Great! Keep learning Java.");
        } else {
            System.out.println("No worries, practice makes it fun!");
        }

        sc.close();

        /*
         Exercises:
         1. Use boolean input in multiple conditions.
         2. Try entering invalid input like 'yes' and observe.
        */
    }
}
