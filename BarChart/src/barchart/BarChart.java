/* Filename BarChart.java
 * Written by Thando Ngwenya
 * Written on 17/05/2020
 * Description : This program accepts the number of points scored by each player in a game and creates a bar 
    chart that illustrates the points scored,
 */
package barchart;
import java.util.Scanner;
public class BarChart 
{
    public static void main(String[] args) 
    {
       int Art, Bob, Cal, Dan, Eli;
       System.out.println("Art please enter your score");
       Art = collectPoints();
       System.out.println("Bob please enter your score");
       Bob = collectPoints();
       System.out.println("Cal please enter your score");
       Cal = collectPoints();
       System.out.println("Dan please enter your score");
       Dan = collectPoints();
       System.out.println("Eli please enter your score");
       Eli = collectPoints();
       System.out.print("Art    ");
       while(Art >= 0)
        {
            System.out.print("*");
            Art--;
        }
       System.out.print("\nBob    ");
       while(Bob >= 0)
        {
            System.out.print("*");
            Bob--;
        }
       System.out.print("\nCal    ");
       while(Cal >= 0)
        {
            System.out.print("*");
            Cal--;
        }
       System.out.print("\nDan    ");
       while(Dan >= 0)
        {
            System.out.print("*");
            Dan--;
        }
       System.out.print("\nEli    ");
       while(Eli >= 0)
        {
            System.out.print("*");
            Eli--;
        }
    }
    public static int collectPoints()
    {
        int points;
        Scanner input = new Scanner(System.in);
        points = input.nextInt();
        return points;
    }
    private static void displayChart(int Art, int Bob, int Cal, int Dan, int Eli) 
    {
        
    }
}