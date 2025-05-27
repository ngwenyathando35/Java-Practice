/* 
 * Filename    : DisplaySavedCustomerList.java pg 724
 * Written by  : Thando Ngwenya
 * Written on  : 26 February 2021
 * Description : This application reads the file created by the WriteCustomerList application and displays the records. Works as intended*/
package displaysavedcustomerlist;
import java.io.*;
import java.nio.file.*;
public class DisplaySavedCustomerList 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\CustomerList.txt");
        String s = null;
        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null)
            {
                System.out.println(s);
                s = reader.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println("Sorry but there seems to be a problem: " + e.getMessage());
        }
    }
}