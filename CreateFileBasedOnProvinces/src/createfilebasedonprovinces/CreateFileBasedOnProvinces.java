/* File Input and Output
 * Filename CreateFileBasedOnProvinces.java
 * Written by The Textbook and Thando Ngwenya
 * Written on 03/02/2020
 * Description : Demonstrating Creating Multiple Random Access Files. This program creates a class that prompts the user for customer data and assigns 
        the data to one of two files depending on the customer’s province of residence. This program assumes that Western Cape(WC) records are assigned
        to an in-province file and that all other records are assigned to an out-of-province file. It first creates empty files to store the records, 
        and then places each record in the correct file. Works as intended */
package createfilebasedonprovinces;
import java.io.*;
import java.nio.file.*;
import java.nio.ByteBuffer;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;
public class CreateFileBasedOnProvinces 
{    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
/*      This program uses two Path objects to hold records for in-province and out-of-province customers. A different String value for Paths based on 
        your System and the location where you want to save your files.                                                                           */
        Path inProvinceFile = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\InProvinceCustomers.txt");
        Path outOfProvinceFile = Paths.get("C:\\Users\\Thando\\Documents\\Work\\Coding\\JAVA\\Files\\OutOfProvinceCustomers.txt");
//      A String that can be used to format the empty files that are created before any actual customer data is written. 
        final String NAME_FORMAT = " ";
        final String ID_FORMAT = "000";//      Constant value for the format of the account number (three digits)
        final int NAME_LENGTH = NAME_FORMAT.length();//      Constant value for the format of the customer name (10 spaces)
        final String PROVINCE = "WC"; //      Constant value for the format of the customer’s province
        final String BALANCE_FORMAT = "0000.00";//      Constant value for the format of the customer’s balance(up to 9999.99).
//      After defining the field delimiter (a comma), a generic customer string by assembling the pieces is built. 
        String delimiter = ",";
        String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + PROVINCE + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
        final int RECSIZE = s.length();//      The record size is then calculated from the dummy record. 
//      A consistent record size is important so it can be used to calculate a record’s position when the files are accessed randomly.        
/*      The last declarations are for two FileChannel references; String and integer representations of the customer’s account number; the customer’s 
        name, province, and balance fields; and a QUIT constant that identifies the end of data entry.*/        
        FileChannel fcIn = null;
        FileChannel fcOut = null;
        String idString, name, province;
        int id;
        double balance;
        final String QUIT = "999";
/*      A method that creates the empty files into which the randomly placed data records can eventually be written. The method accepts the Path for a 
        file and the String that defines the record format.*/
        createEmptyFile(inProvinceFile, s);
        createEmptyFile(outOfProvinceFile, s);
/*      Adding Data-Entry Capability to the Program : In the following steps, coding is added so that it can accept data from the keyboard and write it 
        to the correct location (based on the customer’s account number) within the correct file(based on the customer’s province).*/
//      The following try block handles all the data entry and file writing for customer records:
        try
        {
//          A FileChannel references for both the in-province and out-of-province files.
            fcIn = (FileChannel)Files.newByteChannel(inProvinceFile, CREATE, WRITE);
            fcOut=(FileChannel)Files.newByteChannel(outOfProvinceFile,CREATE,WRITE);
//          The user is prompted for an account number which is accepted and stored.
            System.out.print("Enter customer account number >> ");
            idString = input.nextLine();
//          A loop is then started and will continue to execute as long as the user does not enter the QUIT value
            while(!(idString.equals(QUIT)))
            {
//              The entered account number is converted to an integer so it can be used to calculate the file position for the entered record. 
                id = Integer.parseInt(idString);
//              In a full-blown application, you would add code to ensure that the account number is three digits, 
//              The user is prompted for a name and it is stored. 
                System.out.print("Enter name for customer >> ");
                name = input.nextLine();
//              To ensure that the entered names are stored using a uniform length, the name is assigned to a StringBuilder object, 
                StringBuilder sb = new StringBuilder(name);
//              and then the length is set to the standard length. 
                sb.setLength(NAME_LENGTH);
//              Then the newly sized StringBuilder is assigned back to the String.
                name = sb.toString();
//              The user is prompted for their province and the input is accepted
                System.out.print("Enter province >> ");
                province = input.nextLine();
//              The user is prompted for account balance and the imput is accepted
                System.out.print("Enter balance >> ");
                balance = input.nextDouble();
//              Because the nextDouble() method is used to retrieve the balance, a call to nextLine() to consume the Enter key left in the input stream
                input.nextLine();
//              The DecimalFormat class is used to ensure that the balance meets the format requirements of the file.
                DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);
             /* Because the BALANCE_FORMAT String’s value is 0000.00, zeros will be added to the front or back of any double that would not otherwise 
                meet the standard. E.g. 200.99 will be stored as 0200.99 and 0.1 will be stored as 0000.10. Appendix C of the JavaProgramming Textbook 
                contains more information on the DecimalFormat class and describes other potential formats.*/
//              The String that will  be written to the file is constructed by joining the entered fields with the comma delimiter and the line separator
                s = idString + delimiter + name + delimiter + province + delimiter + df.format(balance) + System.getProperty("line.separator");
//              The constructed String is converted to an array of bytes, and is then wrapped into a ByteBuffer.
                byte data[] = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
//              Depending on the customer’s province, the in-province or out-of-province FileChannel is used. 
//              The File pointer is positioned to start writing a record at the correct place based on the account number, and data String is written.
                if(province.equals(PROVINCE))
                {
                    fcIn.position(id * RECSIZE);
                    fcIn.write(buffer);
                }
                else
                {
                    fcOut.position(id * RECSIZE);
                    fcOut.write(buffer);
                }
//              The user is promplted for the next customer account number
                System.out.print("Enter next customer account number or " + QUIT + " to quit >> ");
                idString = input.nextLine();             
            }
//          The FileChannels are closed
            fcIn.close();
        }
//      This catch block handles any exceptions thrown from the above try block
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }        
    }
//  The following method creates empty default files
    public static void createEmptyFile(Path file, String s)
    {
        final int NUMRECS = 1000; // A  constant for the number of records to be written
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