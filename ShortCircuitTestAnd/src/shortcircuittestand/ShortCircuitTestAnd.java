/*
 * Filename ShortCircuitTestAnd.java
 * Written by The Textbook
 * Description : Using the && operator, demonstrating short circiut evaluation by switch the boolean expressions
    in the if statements
 */
package shortcircuittestand;
public class ShortCircuitTestAnd 
{
    public static void main(String[] args) 
    {
        if(falseMethod() && trueMethod())
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