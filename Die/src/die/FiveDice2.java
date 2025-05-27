/* The program works but I still need to create a fuction that determines which value is higer between the two 
    players
 * Filename FieDice.java
 * Written by Thando Ngwenya
 * Written on 12 Jul2020
 * Description : This program uses the Die class to generate five random numbers for the computer and for the 
    player. It displays the values and then by observing the results, decide who wins based on the following 
    hierarchy of Die values. (The program will not determine the winner, the player will detemine the winner based
    on observation) Any higher combination beats a lower one, e.g five of a kind beats four of a kind. The highest
    sum of numbers wins. */
package die;
public class FiveDice2
{
    public static void main(String[] args) 
    {  
        Die[] computerRandomValues = new Die[5];
        Die[] playerRandomValues = new Die[5];
        //Populate the computer values array
        for(int x = 0; x < 5; ++x)
            computerRandomValues[x] = new Die();
        System.out.print("The computer rolled :\n");
        //Display the computer values array
        displayValues(computerRandomValues);
        //Populate the player values array
        for(int x = 0; x < 5; ++x)
            playerRandomValues[x] = new Die();
        System.out.print("\nYou rolled :\n");
        displayValues(playerRandomValues);
    }
    private static void displayValues(Die[] array) 
    {
        for(int x = 0; x < array.length ; ++x)
        {
            System.out.print(array[x].randomValue + " ");
        }
        
    }
}