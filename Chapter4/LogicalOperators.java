/*
===============================================================================
 Title   : Logical Operators Demonstration
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates logical operators (&&, ||, !) in Java.
===============================================================================
*/

public class LogicalOperators 
{
    public static void main(String[] args) 
    {

        // Declare boolean variables
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // AND operator (&&)
        System.out.println("Java AND Fish: " + (isJavaFun && isFishTasty));
        // true && false = false

        // OR operator (||)
        System.out.println("Java OR Fish: " + (isJavaFun || isFishTasty));
        // true || false = true

        // NOT operator (!)
        System.out.println("NOT JavaFun: " + (!isJavaFun));
        // !true = false

        // Combining relational and logical operators
        int a = 15, b = 20;
        boolean result = (a < b) && (b > 10);  
        System.out.println("Combined expression (a<b && b>10): " + result);

    }
}
