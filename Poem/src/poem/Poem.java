/*
 * Filename Poem.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a parent class named Poem that contains fields for the name of the poem and the number 
        of lines in it. It includes a constructor that requires values for both fields has get methods to 
        retrieve field values.
*/
package poem;
public class Poem 
{
    private String nameOfPoem;
    private int numOfLines;
    public Poem(String name, int numLine)
    {
        nameOfPoem = name;
        numOfLines = numLine;
    }
    public String getNameOfPoem()
    {
        return nameOfPoem;
    }
    public int getNumOfLines()
    {
        return numOfLines;
    }
}