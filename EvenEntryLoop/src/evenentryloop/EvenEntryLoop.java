/*
 * Filename EvenEntryLoop.java
 * Written by Thando Ngwenya
 * Written on 12/05/2020
 * Description : This application asks a user to type an even number or the sentinel value 999 to stop. When the 
    user types an even number, it displays the message “Good job!” and then it asks for another input. When the 
    user types an odd number, it displays an error message and then ask for another input. When the user types 
    the sentinel value 999, ends the program.
 */
package evenentryloop;
import java.util.Scanner;
public class EvenEntryLoop 
{
    public static void main(String[] args) 
    {
        final int SENTINEL = 999;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an even number");
        num = input.nextInt();
        while(num != SENTINEL)
        {
            if(num % 2 == 0)
            {
                System.out.println("Good Job"
                        + "\nPlease enter another number ");
                num = input.nextInt();
            }
            else 
            {
                System.out.println("Error\nPlease enter another number ");
                num = input.nextInt();
            }
        }
        System.out.println("Program terminated");
    }
}