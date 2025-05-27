/* File Input Output
 * Filename PathDemo3.java
 * Written by Java Programming
 * Written on 23/1/2021
 * Description : Demonstrating Checking File Accessibility. This program declares a Path and checks whether a file named there can 
        both be read and executed. Works as intended*/
package pathdemo;
import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
public class PathDemo3 
{
    //public static void main(String[] args)
    {
        Path filePath = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\Data.txt");
        System.out.println("Path is " + filePath.toString());
        try
        {
            filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
            System.out.println("File can be read and executed");
        }
        catch(IOException e)
        {
            System.out.println("File cannot be used for this application");
        }
    }
}