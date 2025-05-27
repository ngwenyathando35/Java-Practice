package arithmatic.demo;
import java.util.Scanner;
/*
 * Filename ArithmaticDemo3.java
 * Written by The text book
 * Written on 08/04/2020
 * Description : To demonstrate how the arithmatic calculations 
 */
public class ArithmaticDemo3 
{
    public static void main(String[] args) 
    {
        int firstNumber, secondNumber, sum, difference;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        firstNumber = input.nextInt();
        System.out.println("Enter another integer");
        secondNumber = input.nextInt();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        //Demonstationg of type casting
        average = ((double)sum)/2;
        
        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber 
                + " is " + average);
    }
}