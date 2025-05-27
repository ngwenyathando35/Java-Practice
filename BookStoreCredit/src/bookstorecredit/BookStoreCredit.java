package bookstorecredit;
import java.util.Scanner;
/*
 * Filename BookStoreCredit.java
 * Written by Thando Ngwenya
 * Written on 10/04/2020
 * Description : This programs prompts students for their averages and awards each student
                 a bookstore credit that is 10 times the student’s grade point average 
 */
public class BookStoreCredit 
{
    public static void main(String[] args) 
    {
        String name;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = input.nextLine();
        System.out.println("Please enter your grade average");
        average = input.nextDouble();
        calcCredit(name, average);
    }
    private static void calcCredit(String name, double average) 
    {
        String Name;
        Name = name;
        double credit, Average;
        credit = average * 10;
        Average = average;
        System.out.println("Hi, your name is " + Name + " and you got " + Average +
                " for your average so you have been awarded R" + credit +
                " to use at the book store");
    }
}