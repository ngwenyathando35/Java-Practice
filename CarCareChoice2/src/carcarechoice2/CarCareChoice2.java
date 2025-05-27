/* Filename CarCareChoice.java
 * Written by Thando Ngwenya
 * Written on 27/6/2020 and modified on 07/07/20
 * Description : The program shows a user a list of available services. It then allows the user to enter a string 
    that corresponds to one of the options, and then displays the option and its price accordingly. It also 
    displays an error message if the user enters an invalid item.               
 * Modified to still compile and execute as long as the user enters the first three characters of a service, the 
    will choice will still be considered valid.                                 */
package carcarechoice2;
import java.util.Scanner;
public class CarCareChoice2
{
    public static void main(String[] args) 
    {
        final int NUMBER_OF_ITEMS = 4;
        String[] services = {"Oil change", "tire rotation", "battery check", "brake inspection"};
        double[] prices = {5.36, 1.23, 3.50, 0.69};
        Scanner input = new Scanner(System.in);
        String service;
        double itemPrice = 0.0;
        boolean validItem = false;
        System.out.println("We offer the following service");
        for(int x = 0; x < services.length; ++x)
            System.out.println(services[x] + ", ");
        System.out.println("Which service do you require");
        service = input.nextLine();
        service = validationOfService(service, services);
        for(int x = 0; x < NUMBER_OF_ITEMS; ++x) 
        {
            if(service.equals(services[x]))
            {
                validItem = true;
                itemPrice = prices[x];
                x = NUMBER_OF_ITEMS;
            }
        }
        if(validItem) 
        {
            System.out.println("The price for item " + service + " is $" + itemPrice);
        } 
        else 
        {
            System.out.println("Sorry - invalid item entered");
        }
    }
    public static String validationOfService(String service, String[] services) 
    {
        
        service = service.substring(0, 3);
        for(int i = 0; i < services.length; i++)
        {
            if(service.equals(services[i].substring(0, 3)))
                service = services[i];
        }    
        return service;
    }
}