/* Filename Majors.java
 * Written by Thando Ngwenya
 * Written on 10/08/2020
 * Description : This program has an enumeration for the six majors offered by a college. It then displays the
    enumeration values for the user, then prompts the user to enter a major. It then displays the college 
    division in which the major falls. ACC and CIS are in the Business Division, CHEM and PHYS are in the 
    Science Division, and ENG and HIS are in the Humanities Division. The program works as intended; */
package majors;
import java.util.Scanner;
public class Majors 
{
    private static void display(Faculties[] major) 
    {
        System.out.println("The majors are: ");
        for(Faculties major1 : major) 
            System.out.println(major1);
    }
    enum Faculties{ACC, CHEM, CIS, ENG, HIS, PHYS};
    public static void main(String[] args) 
    {
        Faculties[] major = Faculties.values();
        Scanner sc = new Scanner(System.in);
        display(major);
        System.out.println("Please enter a major");
        String input = sc.nextLine();
        switch(input)
        {
            case "ACC":
            case "CIS":
                System.out.println("Business Division");
                break;
            case "CHEM":
            case "PHYS":
                System.out.println("Science Division");
                break;
            case "HIS":
            case "ENG":
                System.out.println("Humanities Division");
                break;
            default:
                System.out.println("You entered an invalid option");
        }
    }
}