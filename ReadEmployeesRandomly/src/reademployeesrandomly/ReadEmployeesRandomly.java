/* File Input and Output
 * Filename    : ReadEmployeeFile2.java pg 724
 * Written by  : Thando Ngwenya
 * Written on  : 26 February 2021
 * Description : Demonstrating Reading Records From a Random Access Data File - The user is prompted for an employee ID number, which is converted to an 
        integer with the parseInt() method. (To keep this program short, the application does not check for a valid ID number, so the parseInt() method  
        might throw an exception to the operating system, ending the execution of the application.). (Again, to keep the example short, the ID number is 
        not checked to ensure that it is 999 or less.) The employee record is retrieved from the data file and displayed, and then the user is prompted 
        for the next desired ID number. Works as intended*/
package reademployeesrandomly;
import java.nio.file.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class ReadEmployeesRandomly 
{
    public static void main(String[] args) 
    {
        Scanner keyBoard = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\RandomEmployees.txt");
        String s = "000, ,00.00" + System.getProperty("line.separator");
        final int RECORD_SIZE = s.length();
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        FileChannel fc = null;
        String idString;
        int id;
        final String QUIT = "999";
        try 
        {
            fc = (FileChannel) Files.newByteChannel(file, READ, WRITE);
            System.out.print("Enter employee ID number or " + QUIT + " to quit >> ");
            idString = keyBoard.nextLine();
            while (!idString.equals(QUIT)) 
            {
                id = Integer.parseInt(idString);
                buffer = ByteBuffer.wrap(data);
             /* The position of the desired record is calculated by multiplying the ID number by the record size and then positioning the file pointer at 
                the desired location*/
                fc.position(id * RECORD_SIZE);
                fc.read(buffer);
                s = new String(data);
                System.out.println("ID #" + id + " " + s);
                System.out.print("Enter employee ID number or " + QUIT + " to quit >> ");
                idString = keyBoard.nextLine();
            }
            fc.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error message: " + e);
        }
    }
}