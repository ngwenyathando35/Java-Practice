/* Filename Faculty.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This is a Faculty child class that descends from CollegeEmployee. It includes a Boolean field 
        that indicates whether the Faculty member is tenured, as well as methods that override the CollegeEmployee
        methods to accept and display this additional piece of information. I'm not sure if it works as 
        intended*/
package collegelist;
import javax.swing.JOptionPane;
public class Faculty extends Person
{
    private boolean isTenured;
    public void setIsTenured()
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Faculty", "Are you tenured? Enter 1 for yes or "
                + "any other number for no"));
        if(a == 1)
            isTenured = true;
    }
    public void displayFaculty()
    {
        display();
        System.out.println("Is the member tenured? : " + isTenured);
    }
}