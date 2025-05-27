/* Filename PizzaConstants.java
 * Written by The textbook pg 571
 * Written on 09Sep2020
 * Description : Demonstrating the creation of interfaces to store related constants. The purpose in creating an
        interface containing constants is to provide a set of data that a number of classes can use without 
        having to redeclare the values. In this program, the interface class provides a number of constants for 
        a pizzeria. Any class written for the pizzeria can implement this interface and use the permanent 
        values. Works as intended. */
package pizzaconstants;
public interface PizzaConstants
{
    public static final int SMALL_DIAMETER = 12;
    public static final int LARGE_DIAMETER = 16;
    public static final double TAX_RATE = 0.07;
    public static final String COMPANY = "Thando’s Pizzeria";
}