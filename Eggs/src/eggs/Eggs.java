package eggs;
import java.util.Scanner;
/*
 * Filename Eggs.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description : Displays prices to what the user buys
 */
public class Eggs 
{
    public static void main(String[] args) 
    {
        double Dozen  = 3.25;
        double singleEggs = 0.45;
        double total;
        int numEggs, isDozen, looseEggs;
        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs do you want?");
        numEggs = input.nextInt();
        isDozen = numEggs/12;
        looseEggs = numEggs%12;
        total = (isDozen*Dozen) + looseEggs * singleEggs;
        System.out.println("You orded " + numEggs + " eggs. That's " + isDozen +
                " dozen at &3.25 per dozen and " + looseEggs + " loose eggs at 45 "
                        + "cents each for a total of $" + total);
    }
}
