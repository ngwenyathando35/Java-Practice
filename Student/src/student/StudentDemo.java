package student;
/*
 * Filename StudentDemo.java
 * Written by Thando Ngwenya
 * Written on 20Sep2020
 * Description : This application creates an array of at least six objects to demonstrate how the methods work for
        objects for each Student type
 */
public class StudentDemo
{
    public static void main(String[] args) 
    {
        Student[] students = new Student[6];
        students[0] = new UndergraduateStudent(1234, "Thando");
        students[1] = new UndergraduateStudent(5654, "Ngwenya");
        students[0] = new GraduateStudent(5463, "Phillip");
        students[1] = new GraduateStudent(3654, "Cheese Boy");
        students[0] = new StudentAtLarge(5411, "Mthimunye");
        students[1] = new StudentAtLarge(9878, "Voestek");
        for(int i = 0; i < students.length; i++) 
        {
            students[i].setTuition();
        }
        display(students);
    }
    private static void display(Student[] students) {
        for(int x = 0; x < students.length; x++)
        {
            System.out.println("This student is " + students.getClass() + 
            "\nStudent Name >> " + students[x].getSurname() + 
            "\nStudent ID >> " + students[x].getId() + 
            "\nStudent Tuition >> " + students[x].getTuition());
        }
    }
}