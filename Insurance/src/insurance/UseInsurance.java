package insurance;
import java.util.Scanner;
/* Filename Insurance.java
 * Written by Thando Ngwenya
 * Written on 10/04/2020
 * Description : This application uses an abstract Insurance class and Health and Life subclasses to display 
        different types of insurance policies and the cost per month. It prompts the user for the type of 
        insurance to be displayed, and then creates the appropriate object. Works as intended*/
public class UseInsurance 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String typeInsurance;
        System.out.println("What type of insurance do you want to see?");
        typeInsurance = sc.nextLine();
        if(typeInsurance.equalsIgnoreCase("Health"))
            displayH();
        else if(typeInsurance.equalsIgnoreCase("Life"))
            displayL();
        else
            System.out.println("The has been an error");
    }
    private static void displayH() 
    {
        Health healthInsurance = new Health();
        healthInsurance.setCost();
        healthInsurance.display();
    }
    private static void displayL() 
    {
        Life LifeInsurance = new Life();
        LifeInsurance.setCost();
        LifeInsurance.display();
    }
}