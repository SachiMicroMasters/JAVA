/*
===============================================================================
 Title 		: Multi-Class Object Example
 Author     : Sadan (Sachi µ Masters)
 Place      : Godavarikhani, INDIA
 Date       : 16/08/2025
 Purpose    : Demonstrates how to create an object of one class (Helper) 
			  and use it in another class (MultiClassObjectExample).
===============================================================================
*/

/// Helper class contains a simple method to display a message
class Helper 
{
    /*
     * Method: displayMessage()
     * Purpose: Prints a simple greeting message
     */
    void displayMessage() 
    {
        System.out.println("Hello from Helper class!");
    }
}

/// Main class demonstrates object creation and method calling
public class MultiClassObjectExample 
{
    /*
     * Method: main()
     * Purpose: Entry point of the program.
     */
    public static void main(String[] args) 
    {
        // Step 1: Create an object of Helper class
        Helper h = new Helper();

        // Step 2: Call the displayMessage() method using object
        h.displayMessage();
    }
}


