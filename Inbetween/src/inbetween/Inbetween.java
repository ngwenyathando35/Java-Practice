/* Filename Inbetween.java
 * Written by Thando Ngwenya
 * Written on 12/05/2020
 * Description : This application prompts a user for two integers and displays every integer between them. It also
    displays a message if there are no integers between the entered values.
 */
package inbetween;
import java.util.Scanner;
public class Inbetween 
{
    public static void main(String[] args) 
    {
        int num1, num2, a;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        num1 = input.nextInt();
        System.out.println("Please enter the the second integer");
        num2 = input.nextInt();
        if(num2 > num1)
        {    
            a = num1;
            num1 = num2;
            num2 = a;
        }
        for(;num1 >= num2; --num1)
            System.out.print(num1 + " ");
    }
}