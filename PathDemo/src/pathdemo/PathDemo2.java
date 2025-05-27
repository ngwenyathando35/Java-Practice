/* Using Path and Files Classes
 * Filename PathDemo2.java
 * Written by The The Textbook
 * Written on 15Jan2020
 * Description : Demonstrating Converting a Relative Path to an Absolute One. This is a demonstration program that creates a Path and 
        uses some of the methods such as:
                   toString() - Returns the String representation of the Path, eliminating double backslashes.
           int getNameCount() - Returns the number of name elements in the Path 
            Path getName(int) - Returns the name in the position of the Path specified by the integer parameter. Works as intended*/
package pathdemo;
import java.nio.file.*;
import java.util.Scanner;
public class PathDemo2
{
    //public static void main(String[] args)
    {
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a file name >> ");
        name = keyboard.nextLine();
        Path inputPath = Paths.get(name);
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println("Full path is " + fullPath.toString());
    }
}