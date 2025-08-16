/*
===============================================================================
 Title   : Constants Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates how to declare and use constants with 'final' keyword.
===============================================================================
*/

public class ConstantsExample 
{
    public static void main(String[] args) 
    {
        
        // Declaring constants using 'final'
        final double PI = 3.14159;    // PI value cannot be changed
        final int MAX_USERS = 100;    // Maximum allowed users

        // Printing constants
        System.out.println("Value of PI        : " + PI);
        System.out.println("Maximum Users      : " + MAX_USERS);

        // Uncommenting below line will cause ERROR because constants cannot be modified
        // PI = 3.14; // ❌ Not allowed
    }
}
