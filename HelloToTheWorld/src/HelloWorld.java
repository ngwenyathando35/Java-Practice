/**
 * Date: 15/03/2018
 * Program:Hello World
 * Description: The program asks the user to enter a name and then it displats a message 
 * Programmer: Thando
 */
import java.util.Scanner;
public class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.print("Please enter your name>> ");
        Scanner Input = new Scanner(System.in);
        String Name = Input.nextLine();
        System.out.print("Hello World, my name is "+Name+"\n");
    }
    
}
