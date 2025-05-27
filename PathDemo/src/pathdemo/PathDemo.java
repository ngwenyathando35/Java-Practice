/* Using Path and Files Classes
 * Filename PathDemo.java
 * Written by The The Textbook
 * Written on 11Jan2020
 * Description : Demonstrating retrieving information about a path - The program that creates a Path and uses some of the methods such as 
                toString() - Returns the String representation of the Path, eliminating double backslashes.
        Path getFileName() - Returns the file or directory denoted by this Path; this is the last item in the sequence of name elements
        int getNameCount() - Returns the number of name elements in the Path 
         Path getName(int) - Returns the name in the position of the Path specified by the integer parameter. Works as intended */
package pathdemo;
import java.nio.file.*;
public class PathDemo
{
    //public static void main(String[] args)
    {
        Path filePath = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\Data.txt");
        int count = filePath.getNameCount();
        System.out.println("h is " + filePath.toString());
        System.out.println("File name is " + filePath.getFileName());
        System.out.println("There are " + count + " elements in the file path");
        for(int x = 0; x < count; ++x)
            System.out.println("Element " + x + " is " + filePath.getName(x));
    }
}