/*
===============================================================================
 Title   : Boolean Variables and Operations
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates boolean variables and logical operations in Java.
===============================================================================
*/

public class BooleanExample 
{
    public static void main(String[] args) 
    {
        
        // Declare boolean variables
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Print boolean values
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // Logical operations
        System.out.println("Java AND Fish: " + (isJavaFun && isFishTasty));
        System.out.println("Java OR Fish : " + (isJavaFun || isFishTasty));
        System.out.println("NOT Java    : " + (!isJavaFun));
    }
}
