/* Filename InputGrades.java
 * Written by Thando Ngwenya
 * Written on 07/07/2020
 * Description : This application prompts a user to enter grades for five different courses each for 10 students
    It prompts the user to enter data for one student at a time, including student ID and course data for five 
    courses. It uses prompts containing the number of the student whose data is being entered and the course 
    number—e.g. “Enter ID for student #s”, where s is an integer from 1 through 10, indicating the student, and
    “Enter course ID #n”, where n is an integer from 1 through 5, indicating the course number. It then verifies
    that the professor enters only A, B, C, D, or F for the grade value for each course.  */
package collegecourse;
import java.util.Scanner;
public class InputGrades 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char grade;
        String studentId, courseId;
        System.out.println("Please enter student ID");
        studentId = input.nextLine();
        System.out.println("Please enter course ID");
        courseId = input.nextLine();
        System.out.println("Please enter the grades professer");
        grade =(input.nextLine()).charAt(0);
    }
}