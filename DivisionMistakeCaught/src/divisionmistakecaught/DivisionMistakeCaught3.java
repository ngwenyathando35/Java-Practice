/* Demonstrating Throwing and Catching Multiple Exceptions.
 * Filename DivisionMistakeCaught2.java
 * Written by The textbook pg 609
 * Written on 03Oct2020
 * Description : This program throws two types of Exception objects: an ArithmeticException and an 
        InputMismatchException. The try block in this program surrounds all the statements in which the 
        exceptions might occur. */
package divisionmistakecaught;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionMistakeCaught3 
{
    public static void main(String[] args)
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
            System.out.println(numerator + " / " + denominator + " = " + result);
        }
        catch(InputMismatchException mistake)
        {
            System.out.println("Wrong data type");
        }
        catch(ArithmeticException mistake)
        {
            System.out.println(mistake.getMessage());
        }
        
        System.out.println("End of program");
    }
}