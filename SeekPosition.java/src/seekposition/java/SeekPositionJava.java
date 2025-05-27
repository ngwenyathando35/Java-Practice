/* 
 * Filename    : SeekPosition.java.java pg 725
 * Written by  : Thando Ngwenya
 * Written on  : 04 March 2021
 * Description : This application allows a user to enter a filename and an integer representing a file position. It assumes that the file is in the same 
        folder as the program. It then accesses the requested position within the file, and displays the next 20 characters there */
package seekposition.java;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class SeekPositionJava 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files");
        System.out.println("Enter a file name");
        String filename = input.nextLine();
        System.out.println("Enter the file position in numbers");
        int filePosition = input.nextInt();
        FileChannel fc = 
    }
}