/* Filename DemoArray.java
 * Written by The Textbook
 * Description : Demonstrates how arrays work */
package demoarray;
public class DemoArray 
{
    public static void main(String[] args) 
    {
        double salaries[] = new double[4];
        salaries [0] = 06.25;
        salaries [1] = 06.55;
        salaries [2] = 10.25;
        salaries [3] = 16.85;
        System.out.println("Salaries one by one:");
        System.out.println(salaries [0]);
        System.out.println(salaries [1]);
        System.out.println(salaries [2]);
        System.out.println(salaries [3]);
    }
}