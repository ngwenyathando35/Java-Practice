package numbersdemo;
/*
 * Filename NumbersDemo.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : Demonstrates the method calling and argument sending
 */
public class NumbersDemo 
{
    public static void main(String[] args) 
    {
        int a = 1,b = 2;
        System.out.println("The numbers >> " + a +" " + b);
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
        int newNum = num^2;
       System.out.println("The number squared >> " + newNum);
    }
}