/* It has a problem when it displays the information. The prompting for data works just fine.
 * Filename UseCourse.java
 * Written by Thando Ngwenya
 * Written on 27/08/2020
 * Description : This application named UseCourse prompts the user for course information. If the user enters a 
        class in any of the following departments: BIO, CHM, CIS, or PHY, it creates a LabCourse If the user 
        enters any other department, it creates a CollegeCourse that does not include the lab fee. Then it 
        displays the course data
 */
package collegcourse;
import java.util.Scanner;
public class UseCourse 
{
    public static void main(String[] args) 
    {
        LabCourse lab = new LabCourse(null,0,0);
        CollegeCourse course = new CollegeCourse(null,0,0);;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, Please answer the following question which are about your "
                + "college course.\nWhich department is your course in?");
        String department = sc.nextLine();
        System.out.println("Please enter your course number?");
        int courseNum = sc.nextInt();
        System.out.println("How many credits do you have?");
        int credits = sc.nextInt();
        String[] departments = {"BIO","CHM","CIS","PHY"};
        for(String department1 : departments) 
        {
            if(department.equalsIgnoreCase(department1)) 
                lab = instantiateLab(department, courseNum, credits);
            else
                course = instantiateCourse(department, courseNum, credits);
        }
        lab.display();
        course.display();
    }
    private static LabCourse instantiateLab(String department,int courseNum, int credits) 
    {
        LabCourse lab = new LabCourse(department, courseNum, credits);
        lab.display();
        return lab;
    }
    private static CollegeCourse instantiateCourse(String department, int courseNum, int credits) 
    {
        CollegeCourse course = new CollegeCourse(department, courseNum, credits);
        course.display();
        return course;
    }
}