/*
===============================================================================
 Title   : Print vs Println Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates the difference between print() and println() in Java.
===============================================================================
*/

public class PrintVsPrintln   // Class definition begins
{
    public static void main(String[] args)   // Main method (program entry point)
    {
        // print() displays text on the same line, without moving to the next line
        System.out.print("Hello");   
        
        // Another print() continues on the same line
        System.out.print(" World");   
        
        // println() prints text and then moves cursor to the next line
        System.out.println(" <- no new line in print()");   
        
        // Again println() → prints text and then shifts cursor to next line
        System.out.println("This is println() -> adds new line");   
    }
}
