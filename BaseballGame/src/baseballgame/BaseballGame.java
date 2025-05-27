/*
 * Filename BaseballGame.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a class named BaseballGame that contains data fields for two team names and scores for each team in each of nine innings. 
        There are get and set methods for each field; the get and set methods for the scores require a parameter that indicates which inning’s score is 
        being assigned or retrieved.It doesn't allow an inning score to be set if all the previous innings have not already been set.
 */         
package baseballgame;
public class BaseballGame 
{
    private String name1;
    private String name2;
    private int score1;
    private int score2;
    private int[] innings1 = new int[9];
    private int[] innings2 = new int[9];
    public void setName1(String teamName)
    {
        name1 = teamName;
    }
    public void setName2(String teamName)
    {
        name2 = teamName;
    }
    public int getScore1(int score)
    {
        return score1;
    }
    public int getScore2(int score)
    {
        return score2;
    }
    public int getInning1(int inning, int score)
    {
        return innings1[inning];
    }
    public void setInning1(int inning, int score)
    {
        do
        {
            System.out.println("Please make sure that the pre");
            innings1[inning] = score;
        } 
        while(!allInningsSet(innings1,inning));
    }
    public void setInning2(int inning, int score)
    {
        innings2[inning] = score;
    }
    public int getInning2(int inning, int score)
    {
        return innings2[inning];
    }
    private boolean allInningsSet(int[] innings, int inning) 
    {
        boolean yes = false;
        for(int i = 0; i < inning; i++)
        {
            if(innings[i] > 0)
                yes = true;
        }
        return yes;
    }
}