//This application determines if the supplied number is an odd or even number 
package question.pkg4;
public class Question4 
{
    public static void main(String[] args) 
    {
        int counter;    
        for (counter = 1; counter <= 20; counter++)
        {
            if (counter % 2 == 0)
                System.out.println("Number is even: " +counter);
            
            else
                System.out.println("Number is odd: " +counter);       
        }
    }
}