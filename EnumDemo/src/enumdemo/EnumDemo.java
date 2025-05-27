/* Filename EnumDemo.java
 * Written by The Textbook pg 475
 * Description : Demonstration of Enumerations and (array)methods associated with enumerations */
package enumdemo;
import java.util.Scanner;
public class EnumDemo
{
    /*  In this program, a Month enumeration is declared; */
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    
    //public static void main(String[] args)
    {
        
        Month birthMonth;
        String userEntry;
        int position;
        int comparison;
        Scanner input = new Scanner(System.in);
        System.out.println("The months are:");
        
        /*  a Month variable is uses the enhanced for loop, The enhanced for loop declares a local Month variable 
            named mon that takes on the value of each element in the Month.value() array in turn so it can be 
            displayed.                                          */
        for(Month mon : Month.values())
            System.out.print(mon + " ");
        /*  the user then is prompted to enter the first three letters for a month, which are converted to their
        uppercase equivalents. */
        System.out.print("\n\nEnter the first three letters of " + "your birth month >> ");
        userEntry = input.nextLine().toUpperCase();
        
        /*  The following statement uses the valueOf() method to convert the user’s string to an enumeration 
        value.                                      */
        birthMonth = Month.valueOf(userEntry);
        System.out.println("You entered " + birthMonth);
        //  The follwing statement gets the position of the month in the enumeration list.
        position = birthMonth.ordinal();
        System.out.println(birthMonth + " is in position " + position);
        System.out.println("So its month number is " + (position + 1));
        /*  The follwing statement compares the entered month to the JUN constant. This is followed by an if 
            statement that displays whether the user’s entered month comes before or after JUN in the list, or 
            is equivalent to it.    */
        comparison = birthMonth.compareTo(Month.JUN);
        if(comparison < 0)
            System.out.println(birthMonth + " is earlier in the year than " + Month.JUN);
        else
            if(comparison > 0)
                System.out.println(birthMonth + " is later in the year than " + Month.JUN);
            else
                System.out.println(birthMonth + " is " + Month.JUN);
    }
}