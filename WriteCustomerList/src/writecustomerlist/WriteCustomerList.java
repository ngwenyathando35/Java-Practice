/* Filename    : WriteCustomerList.java
 * Written by  : Thando Ngwenya
 * Written on  : 14 February 2021
 * Description : This program allows a user to input customer records (ID number, first name, last name, and balance owed) and saves each record to a file
        named WriteCustomerList.java. Works as intended*/         
package writecustomerlist;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.*;
import static java.nio.file.Files.newOutputStream;
import static java.nio.file.StandardOpenOption.CREATE;
import java.util.Scanner;
public class WriteCustomerList 
{
    public static void main(String[] args)
    {
        try
        {
            String s = "", name = null, surname = null, la;
            Double balance = null;
            int exitLoop = 0, idNum;
            Scanner input = new Scanner(System.in);
            final int QUIT = 999;
            Path path = Paths.get("C:\\Users\\Thando Ngwenya\\Documents\\Work\\Coding\\Java\\Files\\CustomerList.txt");
            OutputStream output = new BufferedOutputStream(newOutputStream(path,CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Please enter your ID number or " + QUIT + " to close the application >> ");
            idNum = Integer.parseInt(input.nextLine());
            while(exitLoop != 1)
            {
                if(idNum == QUIT)
                    exitLoop = 1;
                else
                {
                    System.out.print("Please enter your name of " + idNum + " >> ");
                    name = input.nextLine();
                    System.out.print("Please enter your surname " + name + ">> ");
                    surname = input.nextLine();
                    System.out.print("So, how much do we owe you " + name + " " + surname + " >> ");
                    balance = input.nextDouble();
                    System.out.print("Please enter another ID number or " + QUIT + " to close the application >> ");
                    idNum = input.nextInt();
                    input.nextLine();
                    s = idNum + "," + name + "," + surname + "," + balance;
                    writer.write(s, 0, s.length());
                    writer.newLine();
                }
            }
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
}