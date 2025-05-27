/*   The program works but it doesn't write out to the files.
  * Filename    : StudentsStanding.java.java pg 725
 * Written by  : Thando Ngwenya
 * Written on  : 04 March 2021
 * Description : This application allows a user to enter student data that consists of an ID number, first name, last name, and grade point average. 
        Depending on whether the student’s grade point average is at least 2.0, it outputs each record either to a file of students in good standing or 
        those on academic probation
*/
package studentsstanding;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;
import java.util.Scanner;

public class StudentsStanding 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String name, surname;
        Double gpa;
        String delimiter = ",";
        int id;
        Path goodStudentsFile = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\GoodStudentsFile.txt");
        Path probationStudentsFile = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\ProbationStudentsFile.txt");
        final String NAME_FORMAT = " ";
        final String ID_FORMAT = "000";
        final String SURNAME_FORMAT = " ";
        final String GPA = "00";//      Grade Point Average
        final int QUIT = 999;
        String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + SURNAME_FORMAT + delimiter + GPA + System.getProperty("line.separator");
        final int RECSIZE = s.length();
        FileChannel fcProbation = null;
        FileChannel fcGood = null;
        createEmptyFile(goodStudentsFile, s);
        createEmptyFile(probationStudentsFile, s);
        try
        {
//          A FileChannel references for both the good Student and probation student files.
            fcProbation = (FileChannel)Files.newByteChannel(probationStudentsFile, CREATE, WRITE);
            fcGood=(FileChannel)Files.newByteChannel(goodStudentsFile,CREATE,WRITE);
            System.out.println("Please enter student ID");
            id = input.nextInt();
            while(id != QUIT)
            {
                input.nextLine();
                System.out.println("Please name");
                name = input.nextLine();
                System.out.println("Please enter surname");
                surname = input.nextLine();
                System.out.println("Please enter grade point average");
                gpa = input.nextDouble();
                input.nextLine();
                s = id + delimiter + name + delimiter + surname + delimiter + gpa + System.getProperty("line.separator");
                byte data[] = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
                if(gpa >= 2)
                {
                    fcGood.position(id * RECSIZE);
                    fcGood.write(buffer);
                }
                else
                {
                    fcProbation.position(id * RECSIZE);
                    fcProbation.write(buffer);
                }
                System.out.print("Enter next student ID or " + QUIT + " to quit >> ");
                id = input.nextInt();
            }
            fcGood.close();
            fcProbation.close();
        }
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }

    private static void createEmptyFile(Path file, String s) 
    {
        final int NUMRECS = 5; // A  constant for the number of records to be written
//      In the try block, a new OutputStream is declared using the method’s Path parameter and then a BufferedWriter is created using the OutputStream.
        try
        {
            OutputStream outputStr = new BufferedOutputStream(Files.newOutputStream(file,CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));
//          A for loop is used to write 1,000 default records using the parameter String.
            for(int count = 0; count < NUMRECS; ++count)
                writer.write(s, 0, s.length());
//          Then the BufferedWriter is closed
            writer.close();
        }
//      A catch block to is used handle any Exception thrown from the try block
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}