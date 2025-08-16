/*
===============================================================================
 Title   : Expression Evaluation & Operator Precedence
 Author  : Sadan Asampally (Sachi µ Masters)
 Place   : Godavarikhani, INDIA
 Date    : 17-Aug-2025
 Purpose : Demonstrates how Java evaluates complex expressions based on operator precedence and associativity.
===============================================================================
*/

public class OperatorPrecedence 
{
    public static void main(String[] args) 
    {

        // Declare integer variables
        int a = 10, b = 5, c = 2;

        // Example 1: Arithmetic precedence
        int result1 = a + b * c;
        // Multiplication (*) has higher precedence than addition (+)
        System.out.println("a + b * c = " + result1); // 10 + (5*2) = 20

        // Example 2: Using parentheses to override precedence
        int result2 = (a + b) * c;
        System.out.println("(a + b) * c = " + result2); // (10+5)*2 = 30

        // Example 3: Combined arithmetic and relational
        boolean result3 = a + b > c * 5;
        // Evaluated as (a+b) > (c*5)
        System.out.println("a + b > c * 5 : " + result3);

        // Example 4: Combined arithmetic, relational, logical
        boolean result4 = (a + b > c * 5) && (b - c < a);
        // Step 1: a+b > c*5 → 15 > 10 → true
        // Step 2: b-c < a → 5-2 < 10 → 3<10 → true
        // Step 3: true && true → true
        System.out.println("(a + b > c*5) && (b - c < a) : " + result4);

        // Example 5: Using unary, ternary, and arithmetic together
        int result5 = (a++ + --b) * (c % 2 == 0 ? 5 : 10);
        // Step 1: a++ → use a=10, then a=11
        // Step 2: --b → b=4
        // Step 3: a++ + --b → 10+4=14
        // Step 4: c%2==0?5:10 → 2%2==0 → 0==0 → true → 5
        // Step 5: 14*5 = 70
        System.out.println("(a++ + --b) * (c%2==0?5:10) = " + result5);

       
    }
}
