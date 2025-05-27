/* Filename FactorCalculatorForKgosi.java
 * Written by Thando Ngwenya
 * Written on 09/06/2020
 * Description : The program calculates factors of the given integer
 */
package factorcalculatorforkgosi;
import java.util.Scanner;
public class FactorCalculatorForKgosi 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int factors;
        for(int i = 1; i <= num; i++)
        {
            int s = num%i;
            if(s == 0)
                System.out.println(s + ", ");
        }
    }
}