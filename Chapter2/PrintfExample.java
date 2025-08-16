/*
===============================================================================
 Title   : Printf Example Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates formatted output using printf() in Java.
===============================================================================
*/

public class PrintfExample    // Class definition begins
{
    public static void main(String[] args)   // Main method (program entry point)
    {
        // Declare and initialize an integer variable 'age'
        int age = 25;  

        // Declare and initialize a string variable 'name'
        String name = "Sadan";   

        // Declare and initialize a double variable 'height'
        double height = 5.9;   

        /*
         Using printf() for formatted output.
         %s -> String placeholder
         %d -> Integer placeholder
         %.2f -> Floating-point with 2 decimal places
         %n -> Platform-independent new line
        */
        System.out.printf("Name: %s, Age: %d, Height: %.2f ft%n", name, age, height);   
    }
}
