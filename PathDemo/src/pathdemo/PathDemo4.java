/* File Input Output: Using File and Path classes
 * Filename PathDemo3.java
 * Written by Java Programming
 * Written on 25/1/2021
 * Description : Demonstrating Deleting a path. This program that displays an appropriate message when deleting a file that does not
        exist, deleting a directory that contains files, deleting a file but don't have the permission to delete a file.Works as 
        intended*/
package pathdemo;
import java.nio.file.*;
import java.io.IOException;
public class PathDemo4 
{
    //public static void main(String[] args) 
    {
        Path filePath = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\Data.txt");
        try
        {
            Files.delete(filePath);
            System.out.println("File or directory is deleted");
         // The Files class deleteIfExists() method also can be used to delete a file, but if the file does not exist, no exception is thrown.
        }
        catch (NoSuchFileException e)
        {
            System.out.println("No such file or directory");
        }
        catch (DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty");
        }
        catch (SecurityException e)
        {
            System.out.println("No permission to delete");
        }
        catch (IOException e)
        {
            System.out.println("IO exception");
        }
    }
}