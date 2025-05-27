/* Filename TestMonthHandling.java
 * Written by Thando Ngwenya
 * Written on 20/04/2020
 * Description : This program declares two LocalDate objects and assigns values that represent January 31 and 
    December 31 in the current year this program,was created. It then display's  output that demonstrates the 
    dates displayed when one, two, and three months are added to each of the objects.   */
package testmonthhandling;
import java.time.*;
public class TestMonthHandling 
{
 //Program compiles successfully but it has a logic error. The Months are not added. 
    public static void main(String[] args) 
    {
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate date2 = LocalDate.of(2020, 1, 30);
        System.out.println("Original Date >> " + date1);
        date1.plusMonths(1);
        System.out.println("One month added >> " + date1);
        date1.plusMonths(2);
        System.out.println("Two months added >> " + date1);
        date1.plusMonths(3);
        System.out.println("Three months added >> " + date1);
        System.out.println("Original Date >> " + date2);
        date2.plusMonths(1);
        System.out.println("One month added >> " + date2);
        date2.plusMonths(2);
        System.out.println("Two months added >> " + date2);
        date2.plusMonths(3);
        System.out.println("Three months added >> " + date2);
    }
}