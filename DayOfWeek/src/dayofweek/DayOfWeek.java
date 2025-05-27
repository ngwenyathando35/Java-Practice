/* Filename DayOfWeek.java
 * Written by Thando Ngwenya
 * Written on 10/08/2020
 * Description : This application contains an enumeration that represents the days of the week. It displays a 
    list of the days, then prompts the user for a day. It then displays business hours for the chosen day. It is 
    assumed that the business is open from 11 to 5 on Sunday, 9 to 9 on weekdays, and 10 to 6 on Saturday. The 
    program works as intended   */
package dayofweek;
import java.util.Scanner;
public class DayOfWeek 
{
    private static void display(DaysOfWeek[] days) 
    {
        System.out.println("The days of the week are: ");
        for(int x = 0; x < days.length; x++)
            System.out.println(days[x]);
    }
    enum DaysOfWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};
    public static void main(String[] args) 
    {
        DaysOfWeek[] days = DaysOfWeek.values();
        DaysOfWeek day;
        Scanner sc = new Scanner(System.in);
        display(days);
        System.out.println("Enter a day");
        String input = sc.nextLine();
        switch(input)
        {
            case "Sunday":
                System.out.println("Business Hours\n11am - 5pm");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Business Hours\n9am - 9pm");
                break;
            case "Saturday":
                System.out.println("Businness Hours\n10am - 6pm");
                break;
            default:
                System.out.println("You chose an invalid option");
        }
    }
}