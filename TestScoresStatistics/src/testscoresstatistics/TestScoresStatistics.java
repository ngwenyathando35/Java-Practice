/* Filename TestScoresStatistics.java
 * Written by Thando Ngwenya
 * Written on 15/05/2020
 * Description : This application that allows a user to enter any number of student test scores until the 
    user enters 999. If the score entered is less than 0 or more than 100, display an appropriate message and do 
    not use the score. After all the scores have been entered, display the number of scores entered, the highest 
    score, the lowest score, and the arithmetic average.
 */
package testscoresstatistics;
import java.util.Scanner;
public class TestScoresStatistics 
{
    public static void main(String[] args) 
    {
        int exit = 999, score;
        Scanner input = new Scanner(System.in);
        while(input.nextInt() != exit)
        {
            score = input.nextInt();
            while(score)
        }
    }
}