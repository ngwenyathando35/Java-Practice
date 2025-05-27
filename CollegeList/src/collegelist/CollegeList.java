/* The program goes into an infinite loop other the user selects data that they want to input
 * Filename CollegeList.java
 * Written by Thando Ngwenya
 * Written on Aug2020
 * Description : This is an application named CollegeList. It declares an array of four “regular” 
        CollegeEmployees, three Faculty, and seven Students. It then prompts the user to specify which type of 
        person’s data will be entered (C, F, or S), or allow the user to quit (Q). While the user chooses to 
        continue , it accepts data entry for the appropriate type of Person. If the user attempts to enter 
        data for more than four CollegeEmployees, three Faculty, or seven Students, it displays an error 
        message. When the user quits, it displays a report on the screen listing each group of Persons under 
        the appropriate heading off “College Employees,” “Faculty,” or “Students.”. If the user has not entered
        data for one or more types of Persons during a session, it displays an appropriate message under the 
        appropriate heading.*/
package collegelist;
import static java.lang.Character.toUpperCase;
import javax.swing.JOptionPane;
public class CollegeList 
{
    private static int countEmp = 0;
    private static int countFac = 0;
    private static int countStu = 0;
    public static void main(String[] args) 
    {
        CollegeEmployee[] emp = new CollegeEmployee[4];
        Faculty[] fac = new Faculty[3];
        Student[] stu = new Student[7];
        char answer;
        answer = (JOptionPane.showInputDialog(null, "Which data do you want to enter\nEnter:\n" + 
                "C for CollegeEmployee"
                + "\nF for Faculty\nS for Student \nEnter Q to Quit")).charAt(0);
        while(answer != 'Q')
        {
            toUpperCase(answer);
            switch(answer)
            {
                case 'C':
                    if(countEmp != emp.length)
                    {
                        promptEmployee(emp, countEmp);
                        countEmp++;
                    }
                    else
                        System.out.println("The array has reached maximum values");
                    break;
                case 'F':
                    if(countFac != fac.length)
                    {
                        promptFaculty(fac, countEmp);
                        countFac++;
                    }
                    else
                        System.out.println("The array has reached maximum values");
                    break;
                case 'S':
                    if(countStu != stu.length)
                    {
                        promptStudent(stu, countEmp);
                        countEmp++;
                    }
                    else
                        System.out.println("The array has reached maximum values");
                    break;
            }
        }
        report(emp);
        report(fac);
        report(stu);
    }
    private static CollegeEmployee[] promptEmployee(CollegeEmployee[] emp, int count) 
    {
        if(countEmp == emp.length)
            JOptionPane.showMessageDialog(null,"Sorry, the employee Array is full");
        else
        {
            emp[count].setName();
            emp[count].setSurname();
            emp[count].setAddress();
            emp[count].setCellNumber();
            emp[count].setZipCode();
            countEmp++;
        }
        return emp;
    }
    private static Faculty[] promptFaculty(Faculty[] fac, int count)
    {
        if(countFac == fac.length)
            JOptionPane.showMessageDialog(null,"Sorry, the employee Array is full");
        else
        {
            fac[count].setName();
            fac[count].setSurname();
            fac[count].setAddress();
            fac[count].setCellNumber();
            fac[count].setZipCode();
            countFac++;
        }
        return fac;
    }
    private static Student[] promptStudent(Student[] stu, int count) 
    {
        if(countStu == stu.length)
            JOptionPane.showMessageDialog(null,"Sorry, the Student Array is full");
        else
        {   
            stu[count].setName();
            stu[count].setSurname();
            stu[count].setAddress();
            stu[count].setCellNumber();
            stu[count].setZipCode();
            countFac++;
        }
        return stu;
    }
    private static void report(CollegeEmployee[] emp) 
    {
        System.out.println("CollegeEmployee Data"
                + "*********************************************************************************\n");
        for(CollegeEmployee emp1 : emp)
            emp1.displayCollegeEmployee();
    }
    private static void report(Faculty[] fac) 
    {
        System.out.println("Faculty Data"
                + "***********************************************************************************\n");
        for(Faculty fac1 : fac) 
            fac1.displayFaculty();
    }
    private static void report(Student[] stu) 
    {
        System.out.println("Student Data\n"
                + "*****************************************************************************\n");
        for(Student stu1 : stu) 
            stu1.displayStudent();
    }
}