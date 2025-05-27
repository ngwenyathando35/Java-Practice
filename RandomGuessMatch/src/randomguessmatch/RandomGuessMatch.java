package randomguessmatch;
import java.util.Scanner;
/*
 * Filename RandomGuessMatch.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description :  
 */
public class RandomGuessMatch 
{
    public static void main(String[] args) 
    {
        int num, randomNum;
        final int MAX = 5;
        boolean isEqual;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 or 5");
        num = input.nextByte();
        randomNum =  1 + (int)(Math.random() * MAX);
        int difference = randomNum - num;
        isEqual = (randomNum == num);
        System.out.println("The difference between the mystery number and your number is " +
                difference + "\n Are the numbers the same? " + isEqual);
    }
}