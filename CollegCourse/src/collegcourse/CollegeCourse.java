/* It has a problem when it displays the information. The prompting for data works just fine.
 * Filename CollegeCourse.java
 * Written by Thando Ngwenya
 * Written on 27/08/2020
 * Description : This is a class named CollegeCourse that includes data fields that hold the department (e.g.ENG)
        the course number (e.g. 101), the credits(e.g. 3), and the fee for the course (e.g. R360). All of the 
        fields are required as arguments to the constructor, except for the fee, which is calculated at R120 per
        credit hour. It includes a display() method that displays the course data
 */
package collegcourse;
public class CollegeCourse 
{
    protected String department;
    protected int courseNum, credit, fee; 
    protected final int PRICE_PER_CREDIT = 120;
    public CollegeCourse(String department, int courseNumber, int credit)
    {
        department = this.department;
        courseNum = courseNumber;
        credit = this.credit;
        fee = PRICE_PER_CREDIT * credit;
    }
    public void display()
    {
        System.out.println("Department    : " + department +
                         "\nCourse number : " + courseNum + 
                         "\nCredit        : " + credit +
                         "\nFee           : " + fee);
    }
}