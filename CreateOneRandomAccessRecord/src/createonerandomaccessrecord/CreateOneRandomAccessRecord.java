/* File Input and Out
 * Filename CreateOneRandomAccessRecord.java
 * Written by Java Programming pg 699
 * Written on 2/02/2020
 * Description : Demonstrating Writing Records to a Random Access File - This program creates a single employee record defined in line 21. The record is
        for employee 002 with a last name of Ngwenya and a pay rate of 12.25. In line 23, the length of this string is assigned to RECSIZE. (In this case,
        RECSIZE is 19, which includes one character for each character in the sample record string, including the delimiting commas, plus two bytes for 
        the line separator value returned by the System.getProperty() method.) After the FileChannel is established, the record is written to the file at 
        the position that begins at two times the record size. The value 2 is hard coded in this demonstration program because the employee’s ID number 
        is 002. Works as intended */
package createonerandomaccessrecord;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class CreateOneRandomAccessRecord 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\RandomEmployees.txt");
        String s = "002,Ngwenya,12.25" + System.getProperty("line.separator");
        System.out.println(s);
        final int RECSIZE = s.length();
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        FileChannel fc = null;
        try
        {
            fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
            fc.position(2 * RECSIZE);
            fc.write(buffer);
            fc.close();
        }
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}