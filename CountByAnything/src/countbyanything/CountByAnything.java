/* Filename CountByAnything.java
 * Written by Thando Ngwenya
 * Written on 12/05/2020
 * Description : The application counts by any number the users enters 300 inclusive, and starts a new line after 
    every multiple of 10
 */
package countbyanything;
import java.util.Scanner;
public class CountByAnything
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number that the program will starting counting by");
        int num = input.nextInt();
        for(; num <= 300; num += num)
        {
            if(num % 10 == 0)
                System.out.println(num + " ");
            else    
                System.out.print(num + " ");
        }
    }
}