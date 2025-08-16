/*
===============================================================================
 Title   : Multi-Class Java Program
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates how to create and use multiple classes in Java
           with constants and data variables.
===============================================================================
*/

// Class containing constants
class Config 
{
    public static final String APP_NAME = "Sachi µ Masters Java App";
    public static final int VERSION = 1;
}

// Main class
public class MultiClassExample 
{
    public static void main(String[] args) 
    {
        
        // Printing constants from another class
        System.out.println("Application Name : " + Config.APP_NAME);
        System.out.println("Version          : " + Config.VERSION);

        // Declaring some local variables
        int users = 50;
        double usage = 75.5;

        System.out.println("Active Users     : " + users);
        System.out.println("Usage Percent    : " + usage + "%");
    }
}
