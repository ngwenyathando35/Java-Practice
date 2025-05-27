/* Demonstrating Exception Handling
 * Filename Divisions.java
 * Written by Thando Ngwenya
 * Written on 22/09/2020
 * Description : This is a class that contains a single, small main() method. The method declares three integers, 
        prompts the user for values for two of them, and calculates the value of the third integer by dividing 
        the first two values.
 */
package divisions;
import java.util.Scanner;
public class Divisions 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int numerator, denominator, result;
        System.out.print("Enter numerator >> ");
        numerator = input.nextInt();
        System.out.print("Enter denominator >> ");
        denominator = input.nextInt();
        result = numerator / denominator;
        System.out.println(numerator + " / " + denominator + " = " + result);
    }
}