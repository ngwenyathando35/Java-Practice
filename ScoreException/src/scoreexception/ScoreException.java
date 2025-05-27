/* Filename ScoreException.java
 * Written by Thando Ngwenya
 * Written on 11Jan2021
 * Description : This application that displays a series of 5 student ID numbers that stored in an array and asks
        the user to enter a numeric test score for the student.  */
package scoreexception;
public class ScoreException extends Exception
{
    public ScoreException()
    {
        super("You're entered an invalid Score");
    }
}