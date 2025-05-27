import java.util.Scanner;
import java.lang.Math;

public class Sorting 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter a number");
        int num1 = Input.nextInt();
        System.out.print("Please enter a 2nd number");
        int num2 = Input.nextInt();
        System.out.print("Please enter a 3rd number");
        int num3 = Input.nextInt();
        int max, med,low;
        if (num1 > num2) {
            if (num1 > num3) 
            {
                max = num1;
                if(num2>num3)
                {
                    med= num2;
                    low = num3;                    
                }
            }
                else
                { med = num1;
                  max = num3;
                  low= num2;
                }
        }
        else
            System.out.print("Highest = ");
        else if System.out.print("Lowest = ");
    }
}