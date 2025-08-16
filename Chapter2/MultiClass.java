/*
===============================================================================
 Title   : Multi-Class Java Program
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates how to create and use multiple classes in Java.
===============================================================================
*/

class First 
{
    // Method of First class to display greeting
    public void greet() 
    {
        System.out.println("Hello from First!");
    }
}

class Second 
{
    // Method of Second class to display greeting
    public void greet() 
    {
        System.out.println("Hello from Second!");
    }
}

public class MultiClass   // Main class (typo in name kept same as your code)
{
    public static void main(String[] args) 
    {
        // Creating objects of both classes and calling their methods
        new First().greet();
        new Second().greet();
    }
}
