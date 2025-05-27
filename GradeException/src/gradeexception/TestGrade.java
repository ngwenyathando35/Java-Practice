/* I did't finish this program
 * Filename TestGrade.java pg660
 * Written by Thando Ngwenya
 * Written on 13Jan2021
 * Description : This program displays a series 10 student ID numbers stored in an array and asks the user to 
        enter a test letter grade for the student. It throws a GradeException if the user does not enter a valid
        letter grade. The program catches the GradeException, and then displays an appropriate message. In 
        addition, it stores an ‘I’ (for Incomplete) for any student for whom an exception is caught. At the end 
        of the application, It displays all the student IDs and grades.
 */
package gradeexception;
import java.util.Scanner;
public class TestGrade 
{
    public static void main(String[] args) 
    {
        String studentNums[] = {"101","102","103","104","105","106","107","108","109","110"};
        System.out.print("Student Numbers:");
        displayIDnums(studentNums);
        enterGrades(studentNums);
    }
    private static void displayIDnums(String[] studentNums) 
    {
        for(int i = 0; i < 10; i++)
            System.out.print(studentNums[i] + " ");
    }
    private static void enterGrades(String[] studentNums) 
    {
        String userId, userGrade;
        Scanner input = new Scanner(System.in);
        System.out.println("\nFor which student would you like to enter a test letter grade?");
        userId = input.nextLine();
        checkIfValid(userId, studentNums);
        System.out.print("Please enter the grade >> ");
        userGrade = input.nextLine();
        boolean exitLoop = false;
        while(exitLoop)
        {
            System.out.println("The loop executed");
            
        }
    }
    private static void checkIfValid(String userId, String[] studentNums) 
    {
        int i = 0;
        for(; i != 8; i++)
        {
            try
            {
                if(i == 7)
                    System.out.println("Student ID does not exist");
                else if(userId.equals(studentNums[i]))
                    i = 7;
            }
            catch(GradeException error)
            {
                System.out.println("Student ID does not exist");
            }
        }
    }
}