/* Filename DivisionMistakeCaught2.java
 * Written by The textbook pg 602
 * Written on 02Oct2020
 * Description : Demonstrating the getMessage() method in Exception Handling. The class uses the getMessage() 
        method to generate the message that “comes with” the caught ArithmeticException argument to the catch 
        block. */
package divisionmistakecaught;
import java.util.Scanner;
public class DivisionMistakeCaught2 
{
//  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numerator, denominator, result;
        System.out.print("Enter numerator >> ");
        numerator = input.nextInt();
        System.out.print("Enter denominator >> ");
        denominator = input.nextInt();
        try
        {
            result = numerator / denominator;
            System.out.println(numerator + " / " + denominator + " = " + result);
        }
        catch(ArithmeticException mistake)
        {
            System.out.println(mistake.getMessage() + " is prohibited\n"
                    + "Or just call Thando to caome and fix the error for you");
        }
            System.out.println("End of program");
    }
}