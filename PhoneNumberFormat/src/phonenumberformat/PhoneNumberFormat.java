/* NB: the program works fine but it seems to not work when the input begins with zero 
 * Filename PhoneNumberFormat.java
 * Written by Thando Ngwenya
 * Written on 28/05/2020
 * Description : This program inserts parentheses, a space, and a dash into a string of 10 user-entered numbers 
    to format it as a phone number. If the user does not enter exactly 10 digits, It display's an error message. 
    It continue to accept user input until the user enters 999 */
package phonenumberformat;
import java.util.Scanner;
public class PhoneNumberFormat 
{
    public static void main(String[] args) 
    {
        long digits;
        String num;
        final long EXIT = 999;
        final char MAXIMUM_NUMBERS = 10;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Please enter exactly ten digits");
            digits = input.nextLong();
            num = Long.toString(digits);
            StringBuilder numbers = new StringBuilder(num);
            if(num.length() < MAXIMUM_NUMBERS)
            {
                System.out.println("Please enter exactly ten digits");
            }
            else
            {
                numbers.insert(0, '(');
                numbers.insert(4, ')');
                numbers.insert(5, ' ');
                numbers.insert(9, '-');
                System.out.println(numbers);
            }
        }
        while(digits != EXIT);
    }
}