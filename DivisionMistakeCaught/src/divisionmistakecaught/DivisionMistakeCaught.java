/* Filename DivisionMistakeCaught.java
 * Written by The textbook pg 600
 * Written on 02Oct2020
 * Description : Demonstrating Exception Handling. The main() method in the class contains a try block with code 
        that attempts division. When illegal integer division is attempted, an ArithmeticException is 
        automatically created and the catch block executes.
 */
package divisionmistakecaught;
import java.util.Scanner;
public class DivisionMistakeCaught
{
    //public static void main(String[] args)
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
            System.out.println("Arithmetic exception was thrown and caught");
        }
        System.out.println("End of program");
    }
}