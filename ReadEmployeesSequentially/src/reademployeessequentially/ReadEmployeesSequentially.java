/* File Input and Output : Reading Records from a Random Access Data File
 * Filename ReadEmployeesSequentially.java
 * Written by The Textbook pg 704
 * Written on 03
/02/2021
 * Description : Demonstrating Accessing a Random Access File Sequentially - The program reads through the 1,000-record file sequentially in a while loop. 
        The statements in line 35 to 44 check for valid ID numbers. This program assumes that no employee has a valid ID number of 000, so the program 
        displays a record only when the ID is not 000. If 000 is a valid ID number, then it checks for a name that is blank, a pay rate that is 0, or both
        Works as intended*/
package reademployeessequentially;
import java.nio.file.*;
import java.io.*;
public class ReadEmployeesSequentially 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\RandomEmployees.txt");
        String[] array = new String[3];
        String s = "";
        String delimiter = ",";
        int id;
        String stringId, name;
        double payRate, gross;
        final double HRS_IN_WEEK = 40;
        double total = 0;
        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println();
            s = reader.readLine();
            while(s != null)
            {
                array = s.split(delimiter);
                stringId = array[0];
                id = Integer.parseInt(array[0]);
                if(id != 0)
                {
                    name = array[1];
                    payRate = Double.parseDouble(array[2]);
                    gross = payRate * HRS_IN_WEEK;
                    System.out.println("ID#" + stringId + " " + name + " $" + payRate + " $" + gross);
                    total += gross;
                }
                s = reader.readLine();
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
        System.out.println(" Total gross payroll is $" + total);
    }
}