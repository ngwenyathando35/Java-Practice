/* It has a problem when it displays the information. The prompting for data works just fine.
 * Filename LabCourse.java
 * Written by Thando Ngwenya
 * Written on 27/08/2020
 * Description : Create a subclass named LabCourse that adds $50 to the course fee. Override the
parent class display() method to indicate that the course is a lab course and to
display all the data.
 */
package collegcourse;
public class LabCourse extends CollegeCourse
{
    public LabCourse(String department, int courseNum, int credit)
    {
        super(department, courseNum, credit);
        int LAB_COURSE_FEE = 50;
        fee =+ LAB_COURSE_FEE; 
    }
    @Override
    public void display()
    {
        System.out.println("This is a Lab Course");
        display();
    }
}