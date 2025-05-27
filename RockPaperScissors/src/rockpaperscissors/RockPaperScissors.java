/* Filename RockPaperScissors.java
 * Written by Thando Ngwenya
 * Written on 07/05/2020, 
 * Description : Its a game about Rock Paper Scissors */
package rockpaperscissors;
import java.util.Scanner;
public class RockPaperScissors 
{
    //public static void main(String[] args) 
    {
        System.out.println("Please enter a number between 1 and 3"
                + "\n1 = Rock" + "\n2 = Paper" + "\n3 = Scissors");
        int ran = 1 + (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num > 3)
        {
            System.out.println("Please enter a number between 0 and 3");
            num = input.nextInt();
        }
        String guess;
        System.out.println(num);
        switch(ran)
        {
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Paper");
                break;
            case 3:
                System.out.println("Scissor");
        }
    }
}