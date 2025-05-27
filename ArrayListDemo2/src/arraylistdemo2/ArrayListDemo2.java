/*
 * Filename ArrayListDemo.java
 * Written by The Textbook pg 471
 * Description : The program demonstrates ArrayLists. It can display the contents of an ArrayList of Strings 
    without looping through the values. The program contains an ArrayList named students that the user populates
    interactively. Displaying the array names produces a comma-separated list between square brackets.  */
package arraylistdemo2;
import javax.swing.*;
import java.util.ArrayList;
public class ArrayListDemo2
{
    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<>();
        String name;
        final int LIMIT = 4;
        for(int x = 0; x < LIMIT; ++x)
        {
            name = JOptionPane.showInputDialog(null,"Enter a student's name");
            students.add(name);
        }
        System.out.println("The names are " + students);
    }
}