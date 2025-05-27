/* The program seems to work but it has a lot of logic errors. It need rigirous testing to point where exactly 
   the bugs lie.
 * Filename SalespersonDatabase.java
 * Written by Thando Ngwenya
 * Written on 02/08/2020 
 * Description: Creates a database that adds, changes and deletes records of that database.*/
package salesperson;
import java.util.Scanner;
import java.util.ArrayList;
public class SalespersonDatabase 
{
    private static int index;
    public static void main(String[] args) 
    {
     /* This application allows a user to store an array that acts as a database of any number of Salesperson 
        objects up to 20. */
        int options;
        final int QUIT = 999;
        ArrayList<Salesperson> sp = new ArrayList<>();
     // While the user decides to continue, the program offers three options: 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + QUIT + " to quit");
        do
        {
         /* To add a record to the database,to delete a record from the database, or to change a record in the
            database*/ 
            System.out.println("Enter 1 to add record, 2 to delete record, 3 to change a record");
            options = input.nextInt();
            switch (options) 
            {
                case 1:
                    addRecord(sp);
                    break;
                case 2:
                    deleteRecord(sp);
                    break;
                case 3:
                    changeRecord(sp);
                    break;
                default:
                    break;
            } 
     /* After each option executes, it displays the updated database in ascending order by Salesperson ID number
            and prompts the user to select the next action. */
        }while(options != 999);
    } 
    private static void addRecord(ArrayList<Salesperson> sp)
    {
        int idNum;
        double salesValue;
        Scanner input = new Scanner(System.in);
     // If the user selects the add option, it issues an error message if the database is full. 
        if(sp.size() >= 20)
            System.out.println("The array is full");
        else
        {
         // Otherwise, it prompts the user for an ID number.
            System.out.println("Please enter an ID number");
            idNum = input.nextInt();
         // If the ID number already exists in the database, it issues an error message. 
            if(checkIfExist(sp, idNum))
                System.out.println("Sorry but that ID number already exists");
            else
            {
             // Otherwise, it prompts the user for a sales value and adds the new record to the database.
                System.out.println("Please enter a sales value");
                salesValue = input.nextDouble();
                Salesperson e = new Salesperson(idNum, salesValue);
                sp.add(e);
                System.out.println("Record added successfully");
            }
        }
    }
    private static void deleteRecord(ArrayList<Salesperson> sp)
    {
        Scanner input = new Scanner(System.in);
     // If the user selects the delete option, it issues an error message if the database is empty
        if(sp.isEmpty())
            System.out.println("The database is empty. There is nothing to delete");
        else
        {
         // Otherwise, it prompts the user for an ID number
            System.out.println("Please enter an ID number");
            int idNum = input.nextInt();
         // If the ID number doesn't exist, it issues an error message
            if(!checkIfExist(sp, idNum))
                System.out.println("Sorry but that ID doesnt exist");
            //Otherwise, it does not access the record for any future processing
            sp.remove(index);
            System.out.println("Record deleted successfully");
        }
    }
    private static void changeRecord(ArrayList<Salesperson> sp) 
    {
        Scanner input = new Scanner(System.in);
        Salesperson e = new Salesperson(0,0);
        // If the user selects the delete option, it issues an error message if the database is empty
        if(sp.isEmpty())
            System.out.println("The database is empty. There is nothing to change");
        else
        {
         // Otherwise, it prompts the user for an ID number
            System.out.println("Please enter an ID number");
            int idNum = input.nextInt();
         // If the requested record doesn't exist, it issues an error message            
            if(checkIfExist(sp, idNum))
                System.out.println("Sorry but that ID doesnt exist");
         // Otherwise, it prompts the user for a new sales value and changes the sales value for the record.
            System.out.println("Please enter a sales value");
            double salesValue = input.nextDouble();
            e.setIdNumber(idNum);
            e.setAnnualSalesAmount(salesValue);
            sp.set(index, e);
            System.out.println("Record changed successfully");
        }
    }
    private static boolean checkIfExist(ArrayList<Salesperson> sp, int idNum)
    {
        boolean checkIfExist = false;
        for(int x = 0; x < sp.size(); x++)
        {
            Salesperson tempSalesperson = sp.get(x);
            int tempId = tempSalesperson.getIdNUmber();
            if(idNum == tempId)
            {
                index = x;
                checkIfExist = true;
            }
        }
        return checkIfExist;
    }
}