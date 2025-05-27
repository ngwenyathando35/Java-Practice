/* Filename CollegeCourse.java
 * Written by Thando Ngwenya
 * Written on 07/07/2020
 * Description : This class contains fields for the course ID, credit hours, and a letter grade. It also includes
    get and set methods for each field.  */
package collegecourse;
public class CollegeCourse 
{
    String courseId;
    int creditHours;
    char letterGrade;
    public void setCourseId(String courseID)
    {
        courseId = courseID;
    }
    public String getCourseId()
    {
        return courseId;}

    public void setCreditHours(int creditHrs)
    {
        creditHours = creditHrs;
    }
    public int getCreditHours()
    {
        return creditHours;
    }
    public void set(char grade)
    {
        letterGrade = grade;
    }
    public char getGrade()
    {
        return letterGrade;
    }
    
}