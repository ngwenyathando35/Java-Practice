/* I did't finish this program
 * Filename TestScore.java
 * Written by Thando Ngwenya
 * Written on 11Jan2021
 * Description :  This class throws a ScoreException if the user does not enter a valid score (less than or equal 
        to 100). Catch the ScoreException, and then display an appropriate message. In addition, it stores a 0 for
        the student’s score. It then displays all the student IDs and scores.  */
package scoreexception;

import java.util.Scanner;

public class TestScore 
{
    public static void main(String[] args)
    {
        StudentScores data[][] = new StudentScores[5][5];
        data[0] = 
        extractData(data);
    }
    private static StudentScores[][] extractData(StudentScores[][] data) 
    {
        int score;
        String studentId;
        Scanner input = new Scanner(System.in);
        System.out.println("Student IDs" + StudentScores);
        System.out.print("For which student do you want to enter a score >> ");
        studentId = input.nextLine();
        System.out.print("Please enter your score >> ");
        return data;
    }
}