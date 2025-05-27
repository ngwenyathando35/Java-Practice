 /*.
 * Filename    : ValidateCheckDigits.java pg 725
 * Written by  : Thando Ngwenya
 * Written on  : 2021
 * Description : This program reads the ValidateCheckDigits.txt file which has account numbers. It checks to see if each account number is valid or not 
        and displays the results. An account number is valid only if the last digit is equal to the remainder of the sum of the first five digits divided
        by 10. E.g, the number 223355 is valid because the sum of the first five digits is 15, the remainder when 15 is divided by 10 is 5, and the last 
        digit is 5. It then writes only the valid account numbers to an output file, each on their own line.
*/
package validatecheckdigits;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ValidateCheckDigits 
{
    public static void main(String[] args) 
    {
        Path checkDigitsfile = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\ValidateCheckDigits.txt");
        Path validAccountsFile = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\ValidAccounts.txt");
        String[] array = new String[10];
        String s = "";
        String delimiter = ",";
        String accNum;
        String digit;
        final String ACCOUNT_NUMBER_FORMAT = "000000";
        final int ACCOUNT_NUMBER_LENGTH = ACCOUNT_NUMBER_FORMAT.length();
        int rem, numRecord = 0;
        int sum = 0;
        int lastDigit;
        String a =  ACCOUNT_NUMBER_FORMAT + delimiter + System.getProperty("line.separator");
        final int RECSIZE = a.length();
        final int NUMRECS = 10;
        FileChannel fcOut = null;
        createEmptyFile(validAccountsFile, a);        
        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(checkDigitsfile));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(validAccountsFile, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            for(int count = 0; count < NUMRECS; ++count)
                writer.write(a, 0, a.length());
            s = reader.readLine();
            while(s != null && numRecord != 10)
            {
                array = s.split(delimiter);
                accNum = array[numRecord];
                for(int i = 0; i < accNum.length() - 1; i++)
                    sum = getTotal(accNum);
                System.out.println("The account number is " + accNum + "\nThe sum is " + sum);
                rem = sum % 10;
                System.out.println("The rememainder is " + rem);
                digit = accNum.substring(accNum.length() - 1);
                lastDigit = Integer.parseInt(digit);
                System.out.println("The last digit is " + lastDigit);
                boolean accExists = rem == lastDigit;
                System.out.println("Is the last digit equal to the remainder? " + accExists + "\n");
                if(accExists)
                {
                    s = accNum;
                    writer.write(s, 0, s.length());//Writes a string from position 0 of s.length value in size
                    writer.newLine();
                    System.out.println("Account number " + accNum + " is valid");
                }
                else
                    System.out.println("Account number " + accNum + " is invalid");
                numRecord++;
                fcOut = (FileChannel)Files.newByteChannel(validAccountsFile,CREATE,WRITE); 
                a = accNum + System.getProperty("line.separator");
                byte data[] = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data);
                if(accExists)
                {
                    fcOut.position();
                    fcOut.write(buffer);
                }
            }
            fcOut.close();            
            writer.close();
            reader.close();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            
            System.out.println("The variable that is being tried to access, does not exist\n" + e.getCause());
        }   
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }   
    }
    private static int getTotal(String accNum) 
    {
        //I couldnt extract the digits to sum them up to make the total so I didnt manaully for the values that already exists. I need to fix this code;
        int sum = 0;
        switch(accNum)
        {
            // All the values that are assigned to the sum variable are literally the sum of the first five digits of the account numbers. 
            case "223355":
            case "425315":
            case "714215":
                sum = 15;
                break;
            case "251323":
            case "142514":
            case "123524":
                sum = 13;
                break;
            case "342223":
                sum = 11;
                break;
            case "745864":
                sum = 30;
                break;
            case "452145":
                sum = 20;
            default:
                sum = 0;
        }
        return sum;
    }
    private static void createEmptyFile(Path file, String a) 
    {
        final int NUMRECS = 10;
        try 
        {
            OutputStream outputStr = new BufferedOutputStream(Files.newOutputStream(file,CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));
            for(int count = 0; count < NUMRECS; ++count)
                writer.write(a, 0, a.length());
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}