/* File Input and Output
 * Filename CrerateEmptyEmployeesFile.java
 * Written by The Textbook
 * Written on 02 Feb 2021
 * Description : Demonstrating Writing Records to a Random Access File - In the line 20, a String that represents a default record is declared. The 
        three-digit employee number is set to zeros, the name consists of seven blanks, the pay rate is 00.00, and the String ends with the system’s line 
        separator value. A byte array is constructed from the String and wrapped into a buffer. Then a file is opened in CREATE mode and a BufferedWriter 
        is established. In line 28, a loop executes 1,000 times. Within the loop, the default employee string is passed to the BufferedWriter object’s 
        write() method. Works as intended*/
package createemptyemployeesfile;
import java.io.*;
import java.nio.file.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class CreateEmptyEmployeesFile 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\RandomEmployees.txt");
        String s = "000,       b  ,00.00" + System.getProperty("line.separator");
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        final int NUMRECS = 1000;
        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            for(int count = 0; count < NUMRECS; ++count)
            {
                writer.write(s, 0, s.length());
            }
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}