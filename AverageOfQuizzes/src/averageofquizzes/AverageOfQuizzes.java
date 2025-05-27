/* Filename AverageOfQuizzes.java
 * Written by The Textbook pg 404
 * Description : To demonstrate how to use part of an array even when other values are not supplied  */
package averageofquizzes;
import java.util.*;
public class AverageOfQuizzes
{
    public static void main(String[] args)
    {
        //The program declares an array that can hold 10 quiz scores.
        int scores[] = new int[10];
        int score = 0, count = 0, total = 0;
        final int QUIT = 999;
        final int MAX = 10;
        Scanner input = new Scanner(System.in);
        /*The user is prompted for a first quiz score then, a while loop starts and continues as long as the
        user does not enter 999. */
        System.out.print("Enter quiz score or " + QUIT + " to quit >> ");
        score = input.nextInt();
        while(score != QUIT)
        {
            //Within the loop: 
            //the entered score is placed in the scores array,
            scores[count] = score;
            //the score is added to a running total,
            total += scores[count];
            //the count of scores entered is incremented.
            ++count;
            //If the score just entered is the tenth score, the score is forced to 999 and the loop ends,
            if(count == MAX)
                score = QUIT;
            //otherwise, the user is prompted for the next score.
            else
            {
                System.out.print("Enter next quiz score or " + QUIT + " to quit >> ");
                score = input.nextInt();
            }
        }
        //The while loop continuously checks to ensure that the user has not entered 999 to quit. 
        //When the loop eventually ends, count holds the number of scores entered. 
        System.out.print("\nThe scores entered were: ");
        for(int x = 0; x < count; ++x)
            System.out.print(scores[x] + " ");
        //The variable count then can be used to control the output loop and to calculate the average score
        if(count != 0)
            System.out.println("\n The average is " + (total * 1.0 / count));
        else
            System.out.println("No scores were entered.");
    }
}