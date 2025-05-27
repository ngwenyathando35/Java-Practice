package arithmatic.demo;
import java.util.Scanner;
/*
 * Filename Arithmatic Demo.java
 * Written by The text book
 * Written on 08/04/2020
 * Description : To demonstrate how the arithmatic calculations 
 */
public class ArithmaticDemo2 
{
    public static void main(String[] args) 
    {
        double firstNumber, secondNumber, sum, difference, average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double");
        firstNumber = input.nextDouble();
        System.out.println("Enter another double");
        secondNumber = input.nextDouble();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (sum)/2;
        
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber 
                + " is " + average);
    }
}