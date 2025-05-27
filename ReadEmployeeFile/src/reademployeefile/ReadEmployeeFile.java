/* File Input and Output - Using File and Path Class
 * Filename ReadEmployee.java
 * Written by The Textbook pg 690
 * Written on 31Jan2021
 * Description : This program reads the Employees.txt file created by the WriteEmployeeFile program. The program declares an InputStream for the file, 
        then creates a BufferedReader using the InputStream. The first line is read into a String; as long as the readLine() method does not return null, 
        the String is displayed and a new line is read. Works as intended. */
package reademployeefile;
import java.nio.file.*;
import java.io.*;
public class ReadEmployeeFile 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\Employees.txt");
        String s = null;
        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null)
            {
                System.out.println(s);
                s = reader.readLine();
            }
            reader.close(); 
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}