/* This program should be flawless but it throws a ClassCastException. I don't know what the fuck that is
 * Filename SalespersonSort.java
 * Written by Thando Ngwenya
 * Written on 01 Aug 2020
 * Description : This application allows a user to enter values for an array of seven Salesperson objects. It 
    then offers the user the choice of displaying the objects in ascending order by either ID number or sales 
    value.
 */
package salesperson;
import java.util.Arrays;
import java.util.Scanner;

public class SalespersonSort 
{
    //public static void main(String[] args) 
    {
        Salesperson[] sp = new Salesperson[3];
        prompDetails(sp);
        display(sp);
    }
    private static Salesperson[] prompDetails(Salesperson[] sp) 
    {
        double amount;
        int idNumber;
        Scanner input = new Scanner(System.in);
        for(int x = 0; x < sp.length; ++x)
        {
            System.out.println("Enter ID number");
            idNumber = input.nextInt();
            System.out.println("Enter amount");
            amount = input.nextDouble();
            sp[x] = new Salesperson(idNumber, amount);
        }
        return sp;
    }
    private static void display(Salesperson[] sp) 
    {
        int answer;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to sort the array according to the id number or the amount"
                + "\nEnter 1 for id Number or any other number for the latter");
        answer = input.nextInt();
        Arrays.sort(sp);
        if(answer == 1)
            bubbleSortId(sp);
        else
            bubbleSortAmount(sp);
        for(int x = 0; x < sp.length; ++x)
        System.out.print("Salesperson " + sp[x] + " details\n"
                + "\nId Number        : " + sp[x].getIdNUmber() + 
                 "Annual Sales Amount : " + sp[x].getAnnualSalesAmount() + 
                "\n------------------------------------\n");
    }
    public static Salesperson[] bubbleSortAmount(Salesperson[] array)
    {
        Salesperson temp;
        int highSubscript = array.length - 1;
        for(int a = 0; a < highSubscript; ++a)
            for(int b = 0; b < highSubscript; ++b)
                if(array[b].getAnnualSalesAmount()> array[b + 1].getAnnualSalesAmount())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
        return array;
    }
    public static Salesperson[] bubbleSortId(Salesperson[] array)
    {
        Salesperson temp;
        int highSubscript = array.length - 1;
        for(int a = 0; a < highSubscript; ++a)
            for(int b = 0; b < highSubscript; ++b)
                if(array[b].getIdNUmber()> array[b + 1].getIdNUmber())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
        return array;
    }
}