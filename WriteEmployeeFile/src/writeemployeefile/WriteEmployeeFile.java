/* Using Path and File classes 
 * Filename WriteEmployeeFile.java
 * Written by The Textbook
 * Written on 31 January 2021
 * Description : Demonstrating Creating and Using Sequential Data Files - This program accepts employee ID numbers, names, and pay rates from the keyboard 
        and sends them to a comma-separated file. Strings of employee data are constructed within a loop that executes while the user does not enter the 
        QUIT value. When a String is complete—that is, when it contains an ID number, name, and pay rate separated with commas—the String is sent to 
        writer in line 42 in the class. The write() method accepts the String from position 0 for its entire length. Works as intended */
package writeemployeefile;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class WriteEmployeeFile 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\Employees.txt");
        String name, s = null;
        int id;
        double payRate;
        final int QUIT = 999;
        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
         /* The following line creates a BufferedWriter named writer. The BufferedWriter class is the counterpart to BufferedReader. It writes text to an 
            output stream, buffering the characters  */
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Enter employee ID number >> ");
            id = input.nextInt();
            while(id != QUIT)
            {
                System.out.print("Enter name for employee #" + id + " >> ");
                input.nextLine(); //Writes a line separator
                name = input.nextLine();
                System.out.print("Enter pay rate >> ");
                payRate = input.nextDouble();
                s = id + "," + name + ","+ payRate;
                writer.write(s, 0, s.length());//Writes a string from position 0 of s.length value in size
                writer.newLine();
                System.out.print("Enter next ID number or " + QUIT + " to quit >> ");
                id = input.nextInt();
            }
            writer.close();// Closes the stream. Flushes it first
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}