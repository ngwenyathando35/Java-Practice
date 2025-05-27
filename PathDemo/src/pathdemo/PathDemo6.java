/* File Input Output: Using File and Path classes
 * Filename PathDemo6.java
 * Written by Java Programming
 * Written on 25/1/2021
 * Description : Demonstrating using the compareTo method. This program shows how you might compare the creation times of two files. As shown in lines 
        26-32 the compareTo() method returns a value of less than 0 if the first FileTime comes before the argument’s FileTime. The method returns a value 
        of greater than 0 if the first FileTime is later than the argument’s, and it returns 0 if the FileTime values are the same. Works as intended*/
package pathdemo;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class PathDemo6 
{
    //public static void main(String[] args) 
    {
        Path file1 = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\Data.txt");
        Path file2 = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\Data2.txt");
        try
        {
            BasicFileAttributes attr1 = Files.readAttributes(file1, BasicFileAttributes.class);
            BasicFileAttributes attr2 = Files.readAttributes(file2, BasicFileAttributes.class);
            FileTime time1 = attr1.creationTime();
            FileTime time2 = attr2.creationTime();
            System.out.println("file1's creation time is: " + time1);
            System.out.println("file2's creation time is: " + time2);
            if(time1.compareTo(time2) < 0)
                System.out.println("file1 was created before file2");
            else
                if(time1.compareTo(time2) > 0)
                    System.out.println("file1 was created after file2");
                else
                    System.out.println("file1 and file2 were created at the same time");
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}