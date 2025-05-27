/* Filename RockPaperScissors.java
 * Written by Thando Ngwenya
 * Written on 07/05/2020, 
   Modified on 31/05/20 (Added determing the winner)
               16/08/20 (Added an enum)
 * Description : Its a game about Rock Paper Scissors */
package rockpaperscissors;
import java.util.Scanner;
public class RockPaperScissors3
{
    enum RPS{Rock, Paper, Scissors}
    public static void main(String[] args) 
    {
        int ran = 1 + (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);
        RPS guess1, guess2;//RPS is the enum which stands for Rock, Paper & Scissors
        String userGuess;
        System.out.println("Please enter either Rock, Paper or Scissors");
        userGuess = input.nextLine();
        switch(userGuess)
        {
            case "rock":
                guess2 = RPS.Rock;
                break;
            case "paper":
                guess2 = RPS.Paper;
                break;
            case "scissors":
                guess2 = RPS.Scissors;
                break;
            default:
                guess2 = RPS.Rock;
        }
        switch(ran)
        {
            case 1:
                guess1 = RPS.Rock;
                break;
            case 2:
                guess1 = RPS.Paper;
                break;
            case 3:
                guess1 = RPS.Scissors;
                break;
            default:
                guess1 = RPS.Rock;
        }
        if(guess1 == RPS.Rock && guess2 == RPS.Paper)
            System.out.println(guess1 + "\nThe computer wins");
        else if(guess1 == RPS.Rock && guess2 == RPS.Scissors)
            System.out.println(guess1 + "\nThe computer wins");
        else if(guess1 == RPS.Paper && guess2 == RPS.Scissors)
            System.out.println(guess1 + "\nYou win");
        else if(guess1 == RPS.Paper && guess2 == RPS.Rock)
            System.out.println(guess1 + "\nThe computer wins");
        else if(guess1 == RPS.Scissors && guess2 == RPS.Rock)
            System.out.println(guess1 + "\nYou win");
        else if(guess1 == RPS.Scissors && guess2 == RPS.Paper)
            System.out.println(guess1 + "\nThe computer wins");
        else if(guess1 == guess2)
            System.out.println(guess1 + "\nIt's a draw");
        else
            System.out.println("Something is wrong");
    }
}