package spaservice;
import java.util.Scanner;
/*
 * Filename CreateSpaServices.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description :    Declaring and using objects
 */
public class CreateSpaServices 
{
    public static void main(String[] args) 
    {
        SpaService firstService = new SpaService();
        firstService = getData(firstService);   
        //Displaying the details for the firsService object.
        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() +" $" + firstService.getPrice());
    }
    public static SpaService getData(SpaService s)
    {
        String service;
        double price;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
    }
}