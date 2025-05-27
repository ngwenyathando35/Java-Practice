/*
 * Filename DivisionMistakeCaught4.java
 * Written by Java Programming pg 612
 * Written on 03Oct2020
 * Description : Demonstrating Throwing and Catching Multiple Exceptions. In this program, both catch blocks 
        display the same message. Because ArithmeticExceptions and InputMismatchExceptions are both subclasses 
        of Exception, a single generic catch block can catch any type of Exception object. */
package divisionmistakecaught;
import java.util.*;
public class DivisionMistakeCaught4
{
    //public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numerator, denominator, result;
        try
        {
            System.out.print("Enter numerator >> ");
            numerator = input.nextInt();
            System.out.print("Enter denominator >> ");
            denominator = input.nextInt();
            result = numerator / denominator;
            System.out.println(numerator + " / " + denominator +
            " = " + result);
        }
        catch(Exception mistake)
        {
            System.out.println("Operation unsuccessful");
        }
            System.out.println("End of program");
    }
}