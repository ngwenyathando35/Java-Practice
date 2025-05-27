/*
 * Filename GradeException.java
 * Written by Thando Ngwenya
 * Written on 13Jan2021
 * Description : This class extends the Exception and contains a static public array of valid grade letters which
        will be used to determine whether a grade entered from the application is valid.
 */
package gradeexception;
public class GradeException extends Exception
{
    public static char validGradeLetters[] = {'A','B','C','D','F','I'};
    public GradeException() throws GradeException
    {
        super("That is an invalid grade");
    }
}