package apartment;
import java.util.Scanner;
/* Filename TestApartments.java
 * Written by Thando Ngwenya
 * Written on 08/05/2020
 * Description : This application creates Apartment objects then prompt a user to enter a minimum number of 
    bedrooms required, a minimum number of baths required, and a maximum rent the user is willing to pay. 
    It then displays the data for all the Apartment objects that meet the user’s criteria or an appropriate 
    message if no such apartments are available. */
public class TestApartment
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many bedrooms are required");
        int minBed = input.nextInt();
        System.out.println("How many bathrooms are required");
        int minBath = input.nextInt();
        System.out.println("How much are you willing to pay of rent");
        int rent = input.nextInt();
        Apartment data1 = new Apartment(203, 1, 1, 2500);
        Apartment data2 = new Apartment(204, 1, 2, 3000);
        Apartment data3 = new Apartment(205, 2, 2, 3500);
        Apartment data4 = new Apartment(206, 2, 3, 4000);
        Apartment data5 = new Apartment(207, 3, 3, 4500);
        display(data1, minBed, minBath, rent);
    }
    public static void display(Apartment data, int minBed, int minBath, int rent) 
    {
        //There is a logic error. It show the apartments that don't meet the criteria
        if((minBed >= data.getNumOfBaths() && minBath >= data.getNumOfBaths()) && rent >= data.getRent())
            System.out.println("**********************************\n"
                    + "Apartments that meet your creteria\n" + 
                    "\nApartmnet number    : " + data.getApartmentNum() + 
                    "\nNumber of bedrooms  : " + data.getnumOfBedrooms() +
                    "\nNumber of bathrooms : " + data.getnumOfBedrooms() + 
                    "\nRent                : R" + data.getRent());
        else
            System.out.println("Unfortunately, there's is no apartment that matches your criteria");
    }
}