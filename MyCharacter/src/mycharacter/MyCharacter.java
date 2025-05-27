/*
 * Filename .java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : 
 */

package mycharacter;

public class MyCharacter 
{
    private String color;
    private int numOfEyes, numOfLives;
    public void setColor(String colour)
    {
        color = colour;
    }
    public String getColor()
    {
        return color;
    }
    public void setNumOfEyes(int numberOfEyes)
    {
        numOfEyes = numberOfEyes;
    }
    public int getNumOfEyes()
    {
        return numOfEyes;
    }
    public void setLives(int lives)
    {
        numOfLives = lives;
    }
    public int getLives()
    {
        return numOfLives;
    }
}