/* Filename FiveDice.java
 * Written by Thando Ngwenya
 * Written on 12 Jul2020
 * Description : This program uses the Die class to generate five random numbers for the computer and for the 
    player. It displays the values and then by observing the results, decide who wins based on the following 
    hierarchy of Die values. (The program will not determine the winner, the player will detemine the winner based
    on observation) Any higher combination beats a lower one, e.g five of a kind beats four of a kind. The highest
    sum of numbers wins. */
package die;
public class FiveDice 
{
    //public static void main(String[] args) 
    {  
        Die randomValue1 = new Die();
        Die randomValue2 = new Die();
        Die randomValue3 = new Die();
        Die randomValue4 = new Die();
        Die randomValue5 = new Die();
        Die randomValue6 = new Die();
        Die randomValue7 = new Die();
        Die randomValue8 = new Die();
        Die randomValue9 = new Die();
        Die randomValue10 = new Die();
        System.out.print("The computer's five number are :\n");
        System.out.print(randomValue1.randomValue + " ");
        System.out.print(randomValue2.randomValue + " ");
        System.out.print(randomValue3.randomValue + " ");
        System.out.print(randomValue4.randomValue + " ");
        System.out.print(randomValue5.randomValue + " \n");
        System.out.print("The player's five number are :\n");
        System.out.print(randomValue6.randomValue + " ");
        System.out.print(randomValue7.randomValue + " ");
        System.out.print(randomValue8.randomValue + " ");
        System.out.print(randomValue9.randomValue + " ");
        System.out.print(randomValue10.randomValue + " ");
    }
}