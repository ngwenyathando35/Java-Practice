package rands;
import java.util.Scanner;
/*
 * Filename Rands.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description : Converts the input into their resperctive denominations 
 */
public class Rands 
{
    public static void main(String[] args) 
    {
        int num, tens, twenties, fives, ones;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        num = input.nextInt();
        twenties = num/20;
        tens = num / 10;
        fives = num / 5;
        ones = num / 1;
        
        System.out.println("There are " + twenties +" twenties");
        System.out.println("There are " + tens +" tens");
        System.out.println("There are " + fives +" fives");
        System.out.println("There are " + ones +" ones");
    }
    
}
