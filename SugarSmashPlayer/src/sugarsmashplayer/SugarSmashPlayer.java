/* To be honest, I found it difficult to understand what this program wants from me
 * Filename SugarSmashPlayer.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a parent class that holds data about a single player. The class contains the following
        fields: The player’s integer ID number, a String screen name, and an array of integers that stores the 
        highest score achieved in each of 10 game levels. It has get and set methods for each field. The get and
        set methods for the scores should each require two parameters—one that represents the score achieved 
        and one that represents the game level to be retrieved or assigned. It displays an error message if the 
        user attempts to assign or retrieve a score from a level that is out of range for the array of scores.
        Additionally, no level except the first one should be set unless the user has earned at least 100 points
        at each previous level.
If a user tries to set a score for a level that is not yet available, issue an error
message.
 */
package sugarsmashplayer;

import java.util.Scanner;

public class SugarSmashPlayer 
{
    private int idNumber;
    private String name;
    private int[] levelScores = new int[10];
    
    public void setIdNum(int idNum)
    {
        idNumber = idNum;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setScores(int level, int score)
    {
        Scanner sc = new Scanner(System.in);
        if(level > levelScores.length)
        {
            System.out.println("You've entered a level that is out of the array's scope\n"
                    + "Please enter the correct level");
            level = sc.nextInt();
        }
        levelScores[level] = score;
    }
    public int getIdNum()
    {
        return idNumber;
    }
    public String getName()
    {
        return name;
    }
    public int getScores(int level, int score)
    {
        Scanner input = new Scanner(System.in);
        if(level > levelScores.length)
        {
            System.out.println("You've entered a level that is out of the array's scope\n"
                    + "Please enter the correct level");
            level = input.nextInt();
        }
        return levelScores[level];
    }
}