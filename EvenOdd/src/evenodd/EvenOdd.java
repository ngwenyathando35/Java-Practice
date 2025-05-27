/* The program should work but I haven't learned how to enable assertions. 
 * Filename EvenOdd.java
 * Written by Thando Ngwenya
 * Written on 29/04/2020
 * Modified on 13/10/2020 to include Exception Handling using assertions
 * Description : The program promps a for a number and passes it to a method that determines whether a value is 
        even. Within the isEven() method, the remainder is taken when the passed parameter is divided by 2. If 
        the remainder after dividing by 2 is 1, result is set to false. If the remainder after dividing by 2 is 
        not 1, result is set to true.
 */
package evenodd;
import java.util.Scanner;
public class EvenOdd 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        num = input.nextInt();
        if(isEven(num))
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
    public static boolean isEven(int number)
    {
        boolean result;
        if(number % 2 == 1)
            result = false;
        else
        {
            result = true;
         /* The statement asserts that when the remainder of a number divided by 2 is not 1, it must be 0. If 
            the expression is not true, a message is created using the values of both number and its remainder 
            after dividing by 2. */
            assert number % 2 == 0 : number + " % 2 is " + number % 2;
        }
        return result;
    }
}