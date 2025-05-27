/* File Input and Output
 * Filename FileOut.java
 * Written by Java Programming
 * Written on 25Jan2021
 * Description : Demonsrating Writing to a File : This program writes a String of bytes to a file. A Path is declared for a Grades.txt file. It declares a 
        String of letter grades allowed in a course. Then, the getBytes() method converts the String to an array of bytes. An OutputStream object is 
        declared and a BufferedOutputStream object is assigned. in a try block. The write() method accepts the byte array and sends it to the output device
        and then the output stream is flushed and closed. */
package fileout;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class FileOut 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\Grades.txt");
        String s = "ABCDF";
        byte[] data = s.getBytes();
        OutputStream output = null;
        try
        {
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}