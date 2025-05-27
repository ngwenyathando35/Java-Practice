/* Filename Student.java
 * Written by Thando Ngwenya
 * Written on 07/07/2020
 * Description : This class creates a Student class containing an ID number and an array of five CollegeCourse 
    objects. It creates a get and set method for the Student ID number. It also creates a get method that returns
    one of the Student’s CollegeCourses. the method takes an integer argument and returns the CollegeCourse in 
    that position (0 through 4). Next, it creates a set method that sets the value of one of the Student’s 
    CollegeCourses; the method takes two arguments—a CollegeCourse and an integer representing the 
    CollegeCourse’s position (0 through 4).                  */
package collegecourse;
public class Student 
{
    int idNumber;
    CollegeCourse[] courses = new CollegeCourse[5];
    public void setIdNumber(int idNum)
    {
        idNumber = idNum;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public CollegeCourse getCollegeCourse(int num)
    {
        return courses[num];
    }
    public void setCollegeCourse(CollegeCourse course, int num)
    {
       courses[num] = course;
    }
}