/*
 * Filename ShortCircuitOr.java
 * Written by The Textbook
 * Description : Using the || operator, demonstrating short circiut evaluation by switching the boolean 
    expressions in the if statement
 */
package shortcircuitor;
public class ShortCircuitOr 
{
    public static void main(String[] args) 
    {
        if(trueMethod() || falseMethod())
        System.out.println("Both are true");
        else
        System.out.println("Both are not true");
    }
    public static boolean trueMethod()
    {
        System.out.println("True method");
        return true;
    }
    public static boolean falseMethod()
    {
        System.out.println("False method");
        return false;
    }
}