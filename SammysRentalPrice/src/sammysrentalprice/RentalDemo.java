/* Filename RentalDemo.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Description : Demontrates the Rental Class                     */
package sammysrentalprice;
import java.util.Scanner;
public class RentalDemo 
{
    public static void main(String[] args)
    {
        int minutesRented;
        Rental data1 = new Rental();
        Rental data2 = new Rental();
        minutesRented = promptMinutesRented();
        String contractNumber = getContractNumber();
        data1.setContractNumber(contractNumber);
        data1.setHoursAndMinutes(minutesRented);
        displayMotto();
        displayMotto();
        calcPrice(minutesRented);
        //longerRental(data1, data2); non-static reference call error
    }
    public static int promptMinutesRented()
    {
        int minutes;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Enter number of minutes you rented the item");
            minutes = input.nextInt();
        }
        while(minutes < 60 || minutes > 7200);
        return minutes;
    }
    public static void displayMotto() 
    {
        System.out.println("  ssssssssssssssssssssssssssssssssssss\n"
            + "  s Sammy's makes it fun in the sun s\n"
            + "  ssssssssssssssssssssssssssssssssssss");
    }
    public static void calcPrice(int minutesRented) 
    {
        int hours, minutes, HOUR_RATE = 40, MINUTE_RATE = 1, cost;
        hours = minutesRented / 60;
        minutes = minutesRented % 60;
        cost = (hours * HOUR_RATE) + (minutes * MINUTE_RATE);
        System.out.println("Hours >> " + hours + "\nMinutes >> " + minutes +"\nTotal Price >> R" + cost);
        for(int i = 0; i != hours;i++)
            System.out.println("Coupon good for 10 percent off next rental");
   }
    public static String getContractNumber() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the contract number");
        String a = input.nextLine();
        return a;
    }

    public int longerRental(Rental data1, Rental data2) 
    {
        int a = data1.getMinutes();
        int b = data1.getMinutes();
        if(a > b)
        {
            System.out.println("Data1 rented longer");
            return a;
        }
        else
        {
            System.out.println("Data2 rented longer");
            return b;
        }
    }
    
}