/*
 * Filename Departments.java
 * Written by Thando Ngwenya
 * Written on 09/08/2020
 * Description : This application stores at least five different department and supervisor names in a two-
    dimensional array. It allows the user to enter a department name (such as “Marketing”) and displays the 
    corresponding supervisor’s name. If the department does not exist, it displays an error message.
*/
package departments;
import java.util.Scanner;
public class Departments 
{
    public static void main(String[] args) 
    {
        int supervisor = 0, departments = 0;
        String options;
        String[][] names = {{"Victor Payera"},
                            {"Thando Ngwenya"},
                            {"Siphiwe Kona"},
                            {"Boitumelo Moalusi"},
                            {"Junior Victor"}};
        Scanner input = new Scanner(System.in);
        System.out.println("Which department supervisor's name do you want to know?\n"
                + "Marketing\n"
                + "IT\n"
                + "HR\n"
                + "Finance\n"
                + "Security");
        options = input.nextLine();
        switch(options)
        {
            case "Marketing":
                departments = 0;
                break;
            case "IT":
                departments = 1;
                break;
            case "Finance":
                departments = 2;
                break;
            case "HR":
                departments = 3;
                break;
            case "Security":
                departments = 4;
                break;
            default :
                departments = 5;
                break;
        }
        if(departments == 5)
            System.out.println("Sorry but that department does not exist");
        else
            System.out.println("The supervisor of that department is " + names[departments][supervisor]);

    }
}