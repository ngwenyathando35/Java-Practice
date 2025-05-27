/* File Input Output: Using File and Path classes
 * Filename PathDemo5.java
 * Written by Java Programming
 * Written on 25/1/2021
 * Description : Demonstrating Determining file attributes. This program displays demonstrates a few methods from using the BasicFileAttributes class. 
        Works as intended*/
package pathdemo;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class PathDemo5
{
    public static void main(String[] args)
    {
        Path filePath =Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\Data.txt");
        try
        {
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Creation time " + attr.creationTime());
            System.out.println("Last modified time " + attr.lastModifiedTime());
            System.out.println("Size " + attr.size());
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}