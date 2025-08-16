/*
===============================================================================
 Title   : BufferedReader Numeric Input
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates reading numeric input using BufferedReader and parsing.
===============================================================================
*/

import java.io.*;

public class BufferedReaderNumericInput 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(br.readLine());

        System.out.print("Enter a double: ");
        double val = Double.parseDouble(br.readLine());

        System.out.println("Integer: " + num + ", Double: " + val);

        br.close();

        /*
         Exercises:
         1. Read multiple numbers separated by commas and parse them.
         2. Try parsing invalid input and observe exception.
        */
    }
}
