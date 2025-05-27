/* The program works as intended but I suspect that there's a logic error 
 * File name : FileSizeComparison
 * Written by : Thando Ngwenya
 * Written on  : 02/10/2021
 * Description : A file has been created and named FavouriteLyric.txt. The file contents are copied and pasted into a word-processing
        program. This application displays the sizes of the two files as well as the ratio of their sizes to each other.*/
package filesizecomparison;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSizeComparison 
{
    public static void main(String[] args) 
    {
        try 
        {
            Path txtFilePath = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\FavouriteLyric.txt");
            Path docFilePath = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\FavouriteLyric.docx");
            BasicFileAttributes attriFile1 = Files.readAttributes(txtFilePath, BasicFileAttributes.class);
            BasicFileAttributes attriFile2 = Files.readAttributes(docFilePath, BasicFileAttributes.class);
            long fileSize1 = attriFile1.size(), fileSize2 = attriFile2.size();
            double ratio1 = (fileSize1 /fileSize2) * 100;
            double ratio2 = (fileSize2 /fileSize1) * 100;
            System.out.println("The size of file one is " + fileSize1 + "\nThe size of file two is " + fileSize2
                +"\nFile1 is " + ratio1 + " times file 2 and \nFile2 is " + ratio2 + " times file2");
        } 
        catch (IOException ex) 
        {
            System.out.println("Input/Output Exception: " + ex.getMessage());
        }
    }
}