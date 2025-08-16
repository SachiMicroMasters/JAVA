/*
===============================================================================
 Title   : Variable Scope Example
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Demonstrates scope of local, instance, and static variables in Java.
===============================================================================
*/

class ScopeExample 
{
    // Instance variable (belongs to object)
    int instanceVar = 10;

    // Static variable (common for all objects of the class)
    static int staticVar = 20;

    public void display() 
    {
        // Local variable (exists only inside method)
        int localVar = 30;

        System.out.println("Instance Variable : " + instanceVar);
        System.out.println("Static Variable   : " + staticVar);
        System.out.println("Local Variable    : " + localVar);
    }
}

public class VariableScope 
{
    public static void main(String[] args) 
    {
        ScopeExample obj = new ScopeExample(); // Create object
        obj.display(); // Call method to show variable values
    }
}
