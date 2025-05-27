/* Using the try block to make the programm 'Foolproof'
 * Filename EnteringIntegers.java
 * Written by Thando Ngwenya
 * Written on 03/10/2020 pg 605
 * Description : Demonstrating consuming what's left in the input buffer using Exception Handling. This program
        accepts and displays an array of six integers. When a user enters valid data, the program runs smoothly.
        However, when the user enters some letters instead of numbers. The program correctly displays Exception 
        occurred, but the user is not allowed to enter data for any of the remaining numbers. The problem can be
        corrected by uncommenting the nextLine() call in line 32. When the program runs again, it executes 
        correctly. Each data entry exception is noted, and the user can continue entering data for the remaining
        array elements.         */
package enteringintegers;
import java.util.Scanner;
public class EnteringIntegers
{
    public static void main(String[] args)
    {
        int[] numberList = {0, 0, 0, 0, 0, 0};
        int x;
        Scanner input = new Scanner(System.in);
        for(x = 0; x < numberList.length; ++x)
        {
            try
            {
                System.out.print("Enter an integer >> ");
                numberList[x] = input.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Exception occurred");
            }
            //input.nextLine();
        }
        System.out.print("The numbers are: ");
        for(x = 0; x < numberList.length; ++x)
            System.out.print(numberList[x] + " ");
        System.out.println();
    }
}