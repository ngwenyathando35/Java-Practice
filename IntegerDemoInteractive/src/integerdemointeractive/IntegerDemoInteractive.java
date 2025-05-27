package integerdemointeractive;
import java.util.Scanner;
/*
 * Filename IntegerDemoInteractiveDemo.java
 * Written by The Textbook
 * Description : to demonstrate accepting user input and how the Scanner class and its methods work
 */
public class IntegerDemoInteractive
{
    public static void main(String[] args) 
    {
        int aInt ;
        short aShort;
        byte aByte;
        long aLong;
        long anotherInt;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        aInt = input.nextInt();
        System.out.println("Please enter a byte");
        aByte = input.nextByte();
        System.out.println("Please enter a short");
        aShort = input.nextShort();
        System.out.println("Please enter a Long");
        aLong = input.nextLong();
        anotherInt = aInt * 100000000;
        
        System.out.println("The int is "+ aInt);
        System.out.println("The byte is "+ aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is "+ aLong);
        System.out.println("The anotherInt is " + anotherInt);
    }
}