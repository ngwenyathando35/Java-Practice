package question.pkg5;
import java.util.Scanner;

public class Asterisks 
{
    public static void main(String[] args) 
    {
        int i;
        int line;
       
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        
        line = input.nextInt();
        for (i=1; i< line; i++)
            Display (i);
        
        for (i = line; i > 0; i--)
             Display(i);
    }

    private static void Display (int line)
    {
        for (int x = line; x > 0; x--)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
