/* File Input and Output
 * Filename ReadEmployeeFile2.java
 * Written by Java Programming pg 692
 * Written on 31Jan2021
 * Description : Many applications would not want to use the file data only as a String like the ReadEmployeeFile program does. This program shows a more 
        useful program in which the retrieved file Strings are split into usable fields. The String class split() method accepts an argument that 
        identifies the field delimiter (in this case, a comma) and returns an array of Strings. Each array element holds one field. Then methods such as
        parseInt() and parseDouble() can be used to reformat the split Strings into their respective data types. As each record is read and split in the
        ReadEmployeeFile2 class, its pay rate field is used to calculate gross pay for the employee based on a 40-hour workweek. Then the gross is
        accumulated to produce a total gross payroll that is displayed after all the data has been processed. Works as intended */
package reademployeefile2;
import java.nio.file.*;
import java.io.*;
public class ReadEmployeeFile2 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\Employees.txt");
        String[] array = new String[3];
        String s = "";
        String delimiter = ",";
        int id;
        String name;
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
                id = Integer.parseInt(array[0]);
                name = array[1];
                payRate = Double.parseDouble(array[2]);
                gross = payRate * HRS_IN_WEEK;
                System.out.println("ID : " + id + "     " + name + "     $" + payRate + "     R" + gross);
                total += gross;
                s = reader.readLine();
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
        System.out.println("Total gross payroll is $" + total);
    }
}