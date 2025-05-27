/* Filename PathDemo.java
 * Written by Thando Ngwenya
 * Written on 02Feb2021
 * Description : This application displays the a file’s name, its containing folder, size, and time of last modification. Works as 
        intended */
package filestatistics;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileStatistics 
{
    public static void main(String[] args) throws IOException 
    {
        Path filePath = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\FileStatistics.txt");
        BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
        System.out.println("The files name is " + filePath.getFileName() + "\nThe files containing folder is " + 
                filePath.getParent() + "\nThe files size is " + attributes.size() + "\nThe files last modification was on " +
                attributes.lastModifiedTime());
    }
}
