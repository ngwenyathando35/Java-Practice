/*
 * Filename CreateEmployeesRandomFile.java
 * Written by The Textbook
 * Written on 03/02/2020
 * Description : Demonstrating Writing Records to A Random Access File : This program accepts any number of records as user input and writes records to a
        file in a loop. In line 36, each employee’s data value is accepted from the keyboard as a String and converted to an integer using the parseInt()
        method. In line 44, the record’s desired position is computed by multiplying the ID number value by the record size. Works as intended*/
package createemployeesrandomfile;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class CreateEmployeesRandomFile 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\RandomEmployees.txt");
        String s = "000, ,00.00" + System.getProperty("line.separator");
        final int RECSIZE = s.length();
        FileChannel fc = null;
        String delimiter = ",";
        String idString;
        int id;
        String name, payRate;
        final String QUIT = "999";
        try
        {
            fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
            System.out.print("Enter employee ID number >> ");
            idString = input.nextLine();
            while(!(idString.equals(QUIT)))
            {
                id = Integer.parseInt(idString);
                System.out.print("Enter name for employee #" + id + " >> ");
                name = input.nextLine();
                System.out.print("Enter pay rate >> ");
                payRate = input.nextLine();
                s = idString + delimiter + name + delimiter + payRate + System.getProperty("line.separator");
                byte[] data = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
                fc.position(id * RECSIZE);
                fc.write(buffer);
                System.out.print("Enter next ID number or " + QUIT + " to quit >> ");
                idString = input.nextLine();
            }
            fc.close();
        }
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}