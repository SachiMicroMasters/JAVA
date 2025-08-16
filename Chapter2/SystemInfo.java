/*
===============================================================================
 Title   : System Information
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 16-Aug-2025
 Purpose : Displays details about Java Runtime such as version, vendor, 
           and JVM name using System.getProperty().
===============================================================================
*/

public class SystemInfo 
{
    public static void main(String[] args) 
    {
        // Print the Java version installed in the system
        System.out.println("Java Version: " + System.getProperty("java.version"));
        
        // Print the name of the JVM vendor (company who developed JVM, e.g., Oracle, OpenJDK)
        System.out.println("JVM Vendor: " + System.getProperty("java.vendor"));
        
        // Print the name of the Java Virtual Machine (e.g., OpenJDK 64-Bit Server VM)
        System.out.println("JVM Name: " + System.getProperty("java.vm.name"));
    }
}
