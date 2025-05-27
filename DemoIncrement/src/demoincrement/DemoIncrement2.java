/* Filename DemoIncrement2.java
 * Written by The Textbook
 * Written on 11/05/2020
 * Description : Demonstrates how prefix and postfix operators are used to increment variables and how 
    incrementing affects the expressions that contain these operators.
 */
package demoincrement;
public class DemoIncrement2 
{
    public static void main(String[] args) 
    {
        int v = 4;
        int plusPlusV = ++v;
        v = 4;
        int vPlusPlus = v++;
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
        System.out.println("v++ is " + vPlusPlus);

        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);
        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + compare2);
    }
}