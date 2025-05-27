/* Filename DemoSubscriptions.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This application declares several objects of both subscription subtypes and displays their data 
        fields. Works as intended.*/
package newspapersubscription;

import java.util.Scanner;

public class DemoSubscriptions 
{
    public static void main(String[] args) 
    {
        PhysicalNewspaperSubscription pns = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription ons = new OnlineNewspaperSubscription();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name your name ");
        String name = input.nextLine();
        System.out.println("Please enter your address");
        String address = input.nextLine();
        pns.setName(name);
        ons.setName(name);
        pns.setAddress(address);
        ons.setAddress(address);
        display(pns, ons);
    }
    private static void display(PhysicalNewspaperSubscription pns, OnlineNewspaperSubscription ons) 
    {
        System.out.println("*****************************************************************\n"
                + "Physical Newspaper Subscription\n"
                + "Name >> " + pns.getName()
                + "\nAddress >> " + pns.getAddress()
                + "\nRate >> " + pns.getRate());
        System.out.println("*****************************************************************\n"
                + "Physical Newspaper Subscription\n"
                + "Name >> " + ons.getName()
                + "\nAddress >> " + ons.getAddress()
                + "\nRate >> " + ons.getRate());
    }
}