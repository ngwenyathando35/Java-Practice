/* This program has logic errors and to be honesst, I cannot figure out whats wrong with it
 * Filename PhoneNumbers.java
 * Written by Thando Ngwenya
 * Written on My Birthday;
 * Description : A personal phone directory contains room for first names and phone numbers for 30 people. This
    program assigns names and phone numbers for the first 10 people. It then prompts the user for a name, and if
    the name is found in the list, it displays the corresponding phone number. If the name is not found in the 
    list, it prompts the user for a phone number, and adds the new name and phone number to the list. It 
    continues to prompt the user for names until the user enters quit. After the arrays are full (containing 30 
    names), it does not allow the user to add new entries */
package phonenumbers;
import java.util.Scanner;
public class PhoneNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String names[] = new String[30];
        String numbers[] = new String[30];
        String nameNum, name, num;
        boolean doesNameExist = false;
        int count = 10;
        final String QUIT = "QUIT";
        String[] initialiseNames = initialiseNames(names);
        String[] initialiseNumbers = initialiseNumbers(numbers);
        System.out.println("Whose name do you want to display or enter to QUIT");
        name = input.nextLine();
        while(!name.equalsIgnoreCase(QUIT) || count != 10);
        {
            for(int x = 0; x < names.length;x++)
            {
                if(name.equals(names[x]))
                {
                    doesNameExist = true;
                    System.out.println(numbers[x]);
                }
            }
            if(doesNameExist == false)
            {
                names[count] = name;
                System.out.println("Name not on the phonebook\nPlease enter the phone number");
                num = input.nextLine();
                numbers[count] = num;
                ++count;
                if(count == 30)
                {
                    System.out.println("The phone book is now full");
                    nameNum = QUIT;
                }
            }
        }
    }
    private static String[] initialiseNames(String[] names) 
    {
        names[0] = "aaa";
        names[1] = "bbb";
        names[2] = "ccc";
        names[3] = "ddd";
        names[4] = "eee";
        names[5] = "fff";
        names[6] = "ggg";
        names[7] = "hhh";
        names[8] = "iii";
        names[9] = "jjj";
        return names ;
    }
    private static String[] initialiseNumbers(String[] numbers)
    {
        numbers[9] = "000";
        numbers[0] = "111";
        numbers[1] = "222";
        numbers[2] = "333";
        numbers[3] = "444";
        numbers[4] = "555";
        numbers[5] = "666";
        numbers[6] = "777";
        numbers[7] = "888";
        numbers[8] = "999";
        return numbers;
    }
}