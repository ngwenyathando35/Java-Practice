/* File input and Output
 * Filename ReadFile.java
 * Written by Java Programmng 2018
 * Written on 26Jan2021
 * Description : Demonstrating reading from a file : This program reads from the Grades.txt file created earlier. The Path is declared, an InputStream is 
        declared using the Path, and, in line 19, a stream is assigned to the InputStream reference. In the second shaded statement in the ReadFile class, 
        a BufferedReader is declared. A BufferedReader reads a line of text from a character-input stream, buffering characters so that reading is more 
        efficient. The readLine() method gets the single line of text from the Grades.txt file, and then the line is displayed. Works as intended */
package readfile;
import java.nio.file.*;
import java.io.*;
public class ReadFile
{
    public static void main(String[] args)
    {
        Path file = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\Grades.txt");
        InputStream input = null;
        try
        {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = null;
            s = reader.readLine();
            System.out.println(s);
         /* 
            If it was required to read multiple lines from the same file, a loop such as the following could be used;
            while(s = reader.readLine() != null)
            System.out.println(s);
            This loop continuously reads and displays lines from the file until the readLine() method returns null, indicating that no more data is 
            available.
         */
        } 
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}