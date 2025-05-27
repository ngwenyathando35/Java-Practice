/* To be honest, I found it difficult to understand what this program wants from me
 * Filename DemoSugarSmash.java
 * Written by Thando Ngwenya pg 531
 * Written on 18Aug2020
 * Description : This program instantiates several objects of each type and demonstrates the methods.
 */
package sugarsmashplayer;
public class DemoSugarSmash 
{
    public static void main(String[] args) 
    {
        PremiumSugarSmashPlayer player = new PremiumSugarSmashPlayer();
        player.setName("Thando");
        player.setIdNum(970709530);
        player.setScores(0, 0);
    }
}