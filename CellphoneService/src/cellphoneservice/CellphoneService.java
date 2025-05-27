/*
 * Filename CellphoneService.java
 * Written by Thando Ngwenya
 * Written on 30/04/2020
 * Description : This program is for Horizon Phones, a provider of cellular phone service. It prompts a user for
    maximum monthly values for talk minutes used, text messages sent, and gigabytes of data used, and then 
    recommend the best plan for the customer’s needs. 
A customer who needs 500 or more minutes of talk 
    and no data should accept either Plan C for up to 100 text messages at R61 per month or Plan D for 100 text 
    messages or more at $70 per month. A customer who needs any data should accept Plan E for up to 2 gigabytes 
    at $79 or Plan F for 2 gigabytes or more at $87
 */
package cellphoneservice;
import java.util.Scanner;
public class CellphoneService 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int minutes, messages, data;
        boolean planA, planB, planC, planD, planE, planF;
        System.out.println("How many talk minutes do you use");
        minutes = input.nextInt();
        System.out.println("How many text messages do you send");
        messages = input.nextInt();
        System.out.println("How much data (in megabytes) do you use");
        data = input.nextInt();
        planA = (minutes < 500) && (0 == messages) && (0 == data);//49
        planB = minutes < 500 && messages > 0;//55
        planC = minutes >= 500 && messages <=100 && 0 == data;
        planD = minutes >=500 && messages >= 100 && 0 == data;
        planE = (minutes >=500) && (messages >= 100) && (data > 0 && data < 2048);
        planF = (minutes >=500) && (messages >= 100) && (data > 2048);
        if(planA)
            System.out.println("Plan A is the best plan for you at R49 per month");
        else if(planB)
            System.out.println("Plan B is the best plan for you at R55 per month");
        else if(planC)
                System.out.println("Plan C is the best plan for you at R61 per month");
        else if(planD)
            System.out.println("Plan D is the best plan for you at R70 per month");
        else if(planE)
            System.out.println("Plan F is the best plan for you at R79");
        else
            System.out.println("Plan F is the best Plan for you at R87");
    }
}