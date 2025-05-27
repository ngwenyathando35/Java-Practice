package arithmatic.demo;
import java.util.Scanner;
/*
 * Filename Arithmatic Demo.java
 * Written by The text book
 * Written on 08/04/2020
 * Description : To demonstrate how the arithmatic calculations 
 */
public class ArithmaticDemo 
{
    public static void main(String[] args) 
    {
        int firstNumber, secondNumber, sum, difference, average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        firstNumber = input.nextInt();
        System.out.println("Enter another integer");
        secondNumber = input.nextInt();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (sum)/2;
        
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber 
                + " is " + average);
    }
}