/* The error in this program is intentional.
 * Filename UninitializedVariableTest.java
 * Written by Thando Ngwenya
 * Written on 03/10/2020
 * Description : In this program, x is declared and its value is received from the user in a try block. Because 
        the user might not enter an integer, the conversion to an integer might fail, and an exception might be 
        thrown. The catch block only displays a message and does not assign a useful value to x. When the 
        program attempts to display x after the catch block, an error message is generated */
package uninitializedvariabletest;
import java.util.Scanner;
public class UninitializedVariableTest
{
    public static void main(String[] args)
    {
        int x;
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("Enter an integer >> ");
            x = input.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
        }
        System.out.println("x is " + x);
        /* There are three ways to circumvent this problem.
        1. A value can be assigned to x before the try block starts. That way, even if an exception is thrown, x
           will have a usable value to display in the last statement.
        2. A usable value can be assigned to x within the catch block. That way, if an exception is thrown, x 
           will again hold a usable value.
        3. The output statement within the try block can be moved. If the conversion of the user’s entry to an 
           integer is successful, the try block finishes execution and the value of x is displayed. However, if
           the conversion fails, the try block is abandoned, the catch block executes, the error message is 
           displayed, and x is not used        */
    }
}