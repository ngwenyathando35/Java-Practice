/* Logic Error. It always say the files are not in the same folder no matter what I change on the code
 * Filename    : CompareFolders.java
 * Written by  : Thando Ngwenya
 * Written on  : 12 February 2021
 * Description : Three Files have been created. This application that determines whether the first two files are located in the same folder as the third one
        The program is then tested to determine if the files are in the same folder not.*/                        
package comparefolders;
import java.nio.file.*;
public class CompareFolders
{
    public static void main(String[] args)
    {
        Path filePath1 = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JavaSimpleCalculator.txt");
        Path filePath2 = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Files\\FavouriteLyric.docx");
        Path filePath3 = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Files\\Data.txt");
        String path1, path2, path3;
        path1 = filePath1.toString();
        path2 = filePath2.toString();
        path3 = filePath3.toString();
        boolean sameFolder = path1.equals(path2);
        if(sameFolder)
            System.out.println("The files are in the same folder");
        else
            System.out.println("The files are not in the same folder");
        sameFolder = path3.equals(path2);
        if(sameFolder)
            System.out.println("The files are in the same folder");
        else
            System.out.println("The files are not in the same folder");
    }
}