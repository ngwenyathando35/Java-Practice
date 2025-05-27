/* Filename Lottery.java
 * Written by Thando Ngwenya
 * Written on 08/05/2020
 * Description : A lottery game application. It generates 3 random numbers, each between 0 and 9. It thens asks
   the user to guess three numbers by entering them. It then compare's each of the user’s guesses to the three 
   random numbers and display's message that includes the user’s guess, the randomly
 */
package lottery;
import java.util.Random;
import java.util.Scanner;

public class Lottery 
{
    public static void main(String[] args) 
    {
        int num1, num2, num3, nom1, nom2, nom3;
        final int LIMIT = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first digit");
        num1 = input.nextInt();
        System.out.println("Enter your second digit");
        num2 = input.nextInt();
        System.out.println("Enter your last digit");
        num3 = input.nextInt();
        Random ran = new Random();
        nom1 = ran.nextInt(LIMIT);
        nom2 = ran.nextInt(LIMIT);
        nom3 = ran.nextInt(LIMIT);
        System.out.println("Winning numbers\n" + nom1 + " " + nom2 + " "+ nom3);
        if(num1 == nom1)
            if(num2 == nom2)
                if(num3 == nom3)
                {
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3);
                    System.out.println("\nAll three numbers are correct\n" + "You've won R1 000 000");
                }
                else
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nOnly two numbers match\n" + "You've won R100");
            else 
            if(num2 == nom3)
                if(num3 == nom2)
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nAll three numbers are correct\n" + "You've won R1 000");
                else
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nOnly two numbers match\n" + "You've won R1 000");
            else
                System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                        "\nOnly one number is correct\n" + "You've won R10");
        else 
        if(num1 == nom2)
            if(num2 == nom1)
                if(num3 == nom3)
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nAll three numbers are correct\n" + "You've won R1000");
                else
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nOnly two numbers match\n" + "You've won R100");
            else 
            if(num2 == nom3)
                if(num3 == nom2)
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nAll three numbers are correct\n" + "You've won R1000");
                else
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nOnly two numbers match\n" + "You've won R100");
            else
                System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                        "\nOnly one number is correct\n" + "You've won R10");
        else 
        if(num1 == nom3)
            if(num2 == nom1)
                if(num3 == nom2)
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nAll three numbers are correct\n" + "You've won R1000");
                else
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nOnly two numbers match\n" + "You've won R100");
            else 
            if(num2 == nom2)
                if(num3 == nom1)
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nAll three numbers are correct\n" + "You've won R1000");
                else
                    System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                            "\nOnly two numbers match\n" + "You've won R100");
            else
                System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                        "\nOnly one number is correct\n" + "You've won R10");
        else
            System.out.println("Your numbers\n" + num1 + " " + num2 + " "+ num3 + 
                    "\nYour numbers don't match\n" + "\nYou've won nothing");
    }
}