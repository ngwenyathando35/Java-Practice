/* The program works but it displays ten birthdays instead of a single one for that specific person that the user
    entered and it does not seem to accept the sentinel value to exit when it's suppose to display the names.

 * Filename BirthdayReminder.java
 * Written by Thando Ngwenya
 * Written on Thando Miya's birthday
 * Description : This application allows a user to enter the names and birthdates of up to 10 friends. It 
    continues to prompt the user for names and birthdates until the user enters the sentinel value “ZZZ” for a 
    name or has entered 10 names, whichever comes first.When the user is finished entering names, it produces a 
    count of how many names were entered, and then displays the names. In a loop, it continuously asks the user 
    to type one of the names and display the corresponding birthdate or an error message if the name has not been
    previously entered. The loop continues until the user enters “ZZZ” for a name.               */
package birthdayreminder;
import java.util.Scanner;
import java.time.LocalDate;
public class BirthdayReminder 
{
    public static void main(String[] args) 
    {
        String[] names = new String[10];
        LocalDate[] birthDates = new LocalDate[10];
        final String QUIT = "ZZZ";
        String nameDate, name;
        int count = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Enter name and birtdate or " + QUIT + " to quit.\n"
                    + "It must be in the format: name yyyy/mm/dd");
            nameDate = input.nextLine();
            if(nameDate.equalsIgnoreCase(QUIT))
                count = 10;
            else
            {   names[count] = extractName(nameDate);
                birthDates[count] = extractDate(nameDate);
                ++count;
            }
        }
        while(count < 10);
        System.out.println("You entered " + count + " names\nThe names are");
        for(int x = 0;  x <= names.length - 1; ++x)
        {
            System.out.println(names[x]);
        }
        do
        {
            System.out.println("Whose birthday do you want to see");
            name = input.nextLine();
            for(int x = 0; x <= names.length - 1; ++x)
            {
                if(name.equals(names[x]))
                System.out.println(birthDates[x]);
                else
                {
                    System.out.println("Invalid name. Enter a valid name");
                    name = input.nextLine();
                }
            }
        }
        while(!name.equals(QUIT));
    }
    private static LocalDate extractDate(String nameDate) 
    {
        int digit = nameDate.indexOf(' ');
        String date;
        int year, month, day;
        date = nameDate.substring(++digit);
        year = Integer.parseInt(date.substring(0,4));
        month = Integer.parseInt(date.substring(5,7));
        day = Integer.parseInt(date.substring(8,10));
        return LocalDate.of(year, month, day);
    }
    private static String extractName(String nameDate) 
    {
        int digit = nameDate.indexOf(' ');
        String name = nameDate.substring(0, digit);
        return name;
    }
}