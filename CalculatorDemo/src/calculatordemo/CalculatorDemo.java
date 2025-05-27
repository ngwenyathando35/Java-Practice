/* Exception Handling
 * Filename CalculatorDemo.java
 * Written by Thando Ngwenya
 * Written on 07/01/2021
 * Description : The program demonstrates Displaying the Windows Calculator. It asks a user to complete a simple 
        arithmetic problem and displays the Windows calculator to help the user. The main method throws an 
        IOException because it will use the Runtime exec() method and not handle the exception the method throws.
 */
package calculatordemo;
import java.util.Scanner;
import java.io.IOException;
public class CalculatorDemo 
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
     // The Process object invokes the built-in calculator program named calc.exe.
        Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\calc.exe");
        
        double num1 = 279.6;
        double num2 = 872.8;
        double answer = num1 + num2;
        double usersAnswer;
        
        System.out.print("What is the sum of " + num1 + " and " + num2 + "? >> ");
        usersAnswer = input.nextDouble();
        if(usersAnswer == answer)
            System.out.println("Correct!");
        else
            System.out.println("Sorry - the answer is " + answer);
    }
}