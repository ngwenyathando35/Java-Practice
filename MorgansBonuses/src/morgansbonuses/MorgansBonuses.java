/* Filename MorgansBonuses.java
 * Written by Thando Ngwenya
 * Written on 10/08/2020
 * Description : Morgan’s Department Store distributes bonuses to its salespeople after the holiday rush. 
    The bonuses are based on full weeks worked during the season and the number of positive online customer 
    reviews. This program a user to continuously enter values for the two bonus-determining factors and displays 
    the appropriate bonus. The program works as intended. */
package morgansbonuses;
import java.util.Scanner;
public class MorgansBonuses 
{
    public static void main(String[] args) 
    {
        int bonuses [][] = {{ 5,  9, 16, 22, 30},
                            {10, 12, 18, 24, 36},
                            {20, 25, 32, 42, 53},
                            {32, 38, 45, 55, 68},
                            {46, 54, 65, 77, 90},
                            {60, 72, 84, 96, 120},
                            {85,100,120,140,175}};
        int weeks, reviews;
        final int QUIT = 999;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i != QUIT;)
        {
            System.out.println("Enter the number of full weeks worked or " + QUIT + " to quit");
            weeks = input.nextInt();
            if(weeks == QUIT)
                i = QUIT;
            else
            {
                System.out.println("Enter the number of reviews received or " + QUIT + " to quit");
                reviews = input.nextInt();
                System.out.println("Your bonus is " + bonuses[weeks][reviews]);
            }
        }
        
    }
}