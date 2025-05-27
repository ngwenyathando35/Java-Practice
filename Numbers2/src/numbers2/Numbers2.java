package numbers2;
import java.util.Scanner;
/*
 * Filename NumbersDemo.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : Demonstrates the method calling and argument sending
 */
public class Numbers2 
{
    public static void main(String[] args) 
    {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        a = input.nextInt();
        System.out.println("Please enter your second number");
        b = input.nextInt();
        System.out.println("The numbers are >> " + a +" and " + b);
        displayTwiceTheNumber(a);
        displayNumberPlusFive(a);
        displayNumberSquared(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(b);
        displayNumberSquared(b);
    }
    public static void displayTwiceTheNumber(int num)
    {
       int newNum = num*2;
       System.out.println("Twice the number >> " + newNum);
    }
    public static void displayNumberPlusFive(int num)
    {
        int newNum = num + 5;
        System.out.println("Number plus five >> " + newNum);
    }
    public static void displayNumberSquared(int num)
    {
        double newNum = num * num;
       System.out.println("The number squared >> " + newNum);
    }
}