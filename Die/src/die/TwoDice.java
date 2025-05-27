/* NB : It's not working 
 * Filename TwoDice.java
 * Written by Thando Ngwenya
 * Written on 20/04/2020
 * Description : Its a game
 */
package die;
public class TwoDice 
{
    //public static void main(String[] args) 
    {
        Die randomValue1 = new Die();
        Die randomValue2 = new Die();
        System.out.println("Random Value1 " + randomValue1.randomValue);
        System.out.println("Random Value2 " + randomValue2.randomValue);
    }
}