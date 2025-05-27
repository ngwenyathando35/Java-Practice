/* Filename DemoArray2.java
 * Written by The Textbook
 * Description : Demonstrates how an display array values usning a for loop */
package demoarray3;
public class DemoArray3 
{
    public static void main(String[] args) 
    {
        double salaries[] = {06.25, 06.55, 10.25, 16.85};
        System.out.println("Salaries one by one:");
        for( int i = 0; i < salaries.length; i++)
        {
            System.out.println(salaries[i]);
        }
    }
}