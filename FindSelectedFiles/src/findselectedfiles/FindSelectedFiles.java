/* 
 * Filename    : FindSelectedFiles.java
 * Written by  : Thando Ngwenya pg 
 * Written on  : 11 February 2021
 * Description : This application determines which , if any, of the following files are stored in the folder where you have saved the
        exercises created in the File Input and Output chapter: autoexec.bat, CompareFolders.java, FileStatistics.class, and Hello.doc.
*/
package findselectedfiles;
import java.nio.file.AccessMode;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
import java.nio.file.attribute.BasicFileAttributes;

public class FindSelectedFiles 
{
    public static void main(String[] args) 
    {
        try
        {
            Path path1 = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\autoexec.bat");
            Path path2 = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\CompareFolders\\src\\comparefolders\\CompareFolders.java");
            Path path3 = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\FileStatistics\\build\\classes\\filestatistics\\FileStatistics.class");
            Path path4 = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\Hello.doc");
            AccessMode[] modes = READ;
            System.out.println(path1.getFileSystem().provider().checkAccess(path4, modes));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }   
}