/* Filename PizzaDemo.java
 * Written by The textbook pg 571
 * Written on 09Sep2020
 * Description : This program that uses each value, that was declared in the interface class.The application only
        needs a declaration for the current special price; all the constants, such as the name of the pizzeria, 
        are retrieved from the interface. The program works as intended*/
package pizzaconstants;
public class PizzaDemo implements PizzaConstants
{
    public static void main(String[] args)
    {
        double specialPrice = 11.25;
        System.out.println("Welcome to " + COMPANY);
        System.out.println("We are having a special offer:\na " + SMALL_DIAMETER + 
                " inch pizza with four toppings\nor a " + LARGE_DIAMETER +
        " inch pizza with one topping\nfor only $" + specialPrice);
        System.out.println("With tax, that is only $" + (specialPrice + specialPrice * TAX_RATE));
    }
}