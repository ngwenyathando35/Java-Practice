/* File Input and Output
 * Filename CreateFileBasedOnProvinces.java
 * Written by The Textbook and Thando Ngwenya
 * Written on 03/02/2020
 * Description : Demonstrating Setting Up a Program to Read the Created Files : This program uses either of the files you just created from the 
        CreateFileBasedOnProvinces program. The program has four parts 
        >> It prompts the user to enter the filename to be used and set up all necessary variables and constants 
        >> A few statistics about the file will be displayed 
        >> The nondefault contents of the file will be displayed sequentially.
        >> A selected record from the file will be accessed directly.   */
package readprovincefile;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class ReadProvinceFile 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String fileName;//String to hold the file name the program will use
        System.out.print("Enter name of file to use >> ");
        fileName = input.nextLine();//The file name is concatenated with the path and a Path object is created
        fileName = "C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\" + fileName;
        Path file = Paths.get(fileName);
        final String ID_FORMAT = "000";
        final String NAME_FORMAT = " ";
        final String PROVINCE = "WC";
        final String BALANCE_FORMAT = "0000.00";
        String delimiter = ",";
        String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + PROVINCE + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();
        byte data[] = s.getBytes();
        final String EMPTY_ACCT = "000";
        String[] array = new String[4];
        double balance;
        double total = 0;
        try
        {
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\nAttributes of the file:");
            System.out.println("Creation time " + attr.creationTime());
            System.out.println("Size " + attr.size());
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
        try
        {
            InputStream iStream = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
            System.out.println("\nAll non-default records:\n");
            s = reader.readLine();
            while(s != null)
            {
                array = s.split(delimiter);
                if(!array[0].equals(EMPTY_ACCT))
                {
                    balance = Double.parseDouble(array[3]);
                    System.out.println("ID #" + array[0] + " " + array[1] + array[2] + " $" + array[3]);
                    total += balance;
                }
                s = reader.readLine();
            }
            System.out.println("Total of all balances is $" + total);
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
        try
        {
            FileChannel fc = (FileChannel)Files.newByteChannel(file, READ);
            ByteBuffer buffer = ByteBuffer.wrap(data);
            int findAcct;
            System.out.print("\nEnter account to seek >> ");
            findAcct = input.nextInt();
            fc.position(findAcct * RECSIZE);
            fc.read(buffer);
            s = new String(data);
            System.out.println("Desired record: " + s);
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}