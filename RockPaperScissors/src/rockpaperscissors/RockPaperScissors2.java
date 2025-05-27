/* Filename RockPaperScissors.java
 * Written by Thando Ngwenya
 * Written on 07/05/2020, 
 * Modified on 31/05/20(Added determing the winner)
 * Description : Its a game about Rock Paper Scissors */
package rockpaperscissors;
import java.util.Scanner;
public class RockPaperScissors2
{
    public static void main(String[] args) 
    {
        int ran = 1 + (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);
        String guess1, guess2;
        System.out.println("Please enter a number Rock, Paper or Scissors");
        guess2 = input.nextLine();
        switch(ran)
        {
            case 1:
                guess1 = "Rock";
                break;
            case 2:
                guess1 = "Paper";
                break;
            case 3:
                guess1 = "Scissors";
                break;
            default:
                guess1 = "rock";
        }
        if(guess1.equalsIgnoreCase("rock") && guess2.equals("paper"))
            System.out.println(guess1 + "\nThe computer wins");
        else if(guess1.equalsIgnoreCase("rock") && guess2.equalsIgnoreCase("scissors"))
            System.out.println(guess1 + "\nThe computer wins");
        else if("paper".equalsIgnoreCase(guess1) && "scissors".equalsIgnoreCase(guess2))
            System.out.println(guess1 + "\nYou win");
        else if("paper".equalsIgnoreCase(guess1) && "rock".equalsIgnoreCase(guess2))
            System.out.println(guess1 + "\nThe computer wins");
        else if("scissors".equalsIgnoreCase(guess1) && "rock".equalsIgnoreCase(guess2))
            System.out.println(guess1 + "\nYou win");
        else if("scissors".equalsIgnoreCase(guess1) && "paper".equalsIgnoreCase(guess2))
            System.out.println(guess1 + "\nThe computer wins");
        else if(guess1.equalsIgnoreCase(guess2))
            System.out.println(guess1 + "\nIt's a draw");
        else
            System.out.println("Something is wrong");
    }
}