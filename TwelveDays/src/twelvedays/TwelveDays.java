/* Filename TwelveDay.java
 * Written by Thando Ngwenya
 * Written on 8/05/2020
 * Description : Twelve days of chrismas. This application that displays the words to the song starting with any 
    day the user enters
 */
package twelvedays;
import java.util.Scanner;
public class TwelveDays 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of the day");
        int code;
        code = input.nextInt();
        System.out.println("On the 1st day of christmas, my true love gave me");
        switch (code)
        {
            case 12:
                System.out.println("Twelve");
            case 11:
                System.out.println("Eleven");
            case 10:
                System.out.println("Ten");
            case 9:
                System.out.println("Nine");
            case 8:
                System.out.println("Eight");
            case 7:
                System.out.println("Seven");
            case 6:
                System.out.println("Six");
            case 5:
                System.out.println("Five");
            case 4:
                System.out.println("Four");
            case 3:
                System.out.println("Three");
            case 2:
                System.out.println("Two");
            case 1:
                System.out.println("One");
        }
        System.out.println("And thats what she gave me");
    }
}