package sacks.fifth.avenue;
/*
Programmer	: Thando Ngwenya
Date		: 27/04/2018
Program		: Sacks Fifth Avenue
Description	: The program determines which volunteer to assign to price a donated item. It prompts the user to answer a question 
                  about whether a donation is clothing or some other type, and then the program displays the name of the volunteer who
                  handles such donations. Clothing donations are handled by Phillip, and other donations are handled by Thando.
*/
import java.util.Scanner;

public class SacksFifthAvenue 
{
    public static void main(String[] args) 
    {
       int donationType;
       String volunteer;
       String message;
       final int clothingCode = 1;
       final int otherCode = 2;
       final String pricer1="Thando";
       final String pricer2 ="Phillip";
       
       Scanner input= new Scanner(System.in);
       System.out.println("What type of motherfucking donation is this");
       System.out.print("Please enter 1 for clothing and 2 for any other item >> ");
       
       donationType = input.nextInt();
       
        if (donationType == clothingCode) 
            {
                volunteer = pricer1;
                message = "a clothing donation";
            } 
            else 
            {
                volunteer = pricer2;
                message = "a non-clothing donation";
            }
    }
   }
               
       System.out.println("You entered "+donationType+"\nThis is "+message+"\nThe volunteer who will price this item is "+volunteer);
       
           
       
    }
}
