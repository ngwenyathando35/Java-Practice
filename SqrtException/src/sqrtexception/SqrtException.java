/* I can't seem to get it to throw the exception because it is already handled by the Math.sqrt() method
 * Filename SqrtException.java
 * Written by Thando Ngwenya
 * Written on 8/01/2021
 * Description : This application throws and catches an ArithmeticException when it attempts to take the square
        root of a negative value. It prompts the user for an input value and tries the Math.sqrt() method on it. 
        It then either displays the square root or catches the thrown Exception and displays an appropriate 
        message */
package sqrtexception;

import java.util.Scanner;

public class SqrtException 
{
    static double squaroot;
    public static void main(String[] args) throws ArithmeticException
    {
        Scanner input = new Scanner(System.in);
        double num;
        System.out.println("Please enter a number so we can calculate the square root");
        num = input.nextInt();
        squaroot = calcSquaroot(num);
        System.out.println("The square root is " + squaroot);
    }
    private static double calcSquaroot(double num) throws ArithmeticException
    {
        System.out.println("Threw and caught");
        squaroot = Math.sqrt(num);
        return squaroot;
    }
}