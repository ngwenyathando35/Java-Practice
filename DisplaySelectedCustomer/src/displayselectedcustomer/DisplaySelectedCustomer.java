/* 
 * Filename    : DisplaySelectedCustomer.java pg 724
 * Written by  : Thando Ngwenya
 * Written on  : 26 February 2021
 * Description : This application allows the user to enter any ID number, reads the customer data file created by the program WriteCustomerList, and 
        displays the data for the customer. It displays an appropriate message if the ID number cannot be found in the input file.*/
package displayselectedcustomer;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
import java.util.Scanner;
public class DisplaySelectedCustomer 
{
    public static void main(String[] args) 
    {
        Path file = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\JAVA\\Files\\CustomerList.txt");
        String[] record = new String[4];
        String[][] records = new String[4][];
        String s = "";
        String delimiter = ",";
        int id, recordNum = 0;
        String name, surname;
        Scanner keyboard = new Scanner(System.in);
        double balance;
        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println();
            s = reader.readLine();
            while(s != null)
            {
                record = s.split(delimiter);
                id = Integer.parseInt(record[0]);
                name = record[1];
                surname = record[2];
                balance = Double.parseDouble(record[3]);
                enterRecord(recordNum, records, id, name, surname, balance);
                recordNum++;
                System.out.println("ID " + id + "   " + name + "    " + surname + "     R" + balance);
                s = reader.readLine();
            }
            reader.close();
            System.out.println("Which record do you seek >> ");
            String a = keyboard.nextLine();
            searchRecord(records, a);
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
    private static void searchRecord(String[][] records, String a)
    {
        boolean exists = false;
        for(int i = 0; i < records[][]  .length; i++)
        {
            if(a ==  records[][0])
                exists = true;
        }
    }
    private static String[][] enterRecord(int recordNum, String[][] records, int id, String name, String surname, double balance) 
    {
        records[recordNum][0] = "" + id;
        records[recordNum][1] = "" + name;
        records[recordNum][2] = "" + surname;
        records[recordNum][3] = "" + balance;
        return records;
    }
}