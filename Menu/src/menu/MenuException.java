/* Exeption Handling
 * Filename MenuException.java
 * Written by Thando Ngwenya
 * Written on 19Oct2020
 * Description : Demonstrating creating your own Exception class. This class extends Exception. Its constructor 
        requires a String argument, which is passed to the parent class to be used as a return value for the 
        getMessage() method. */
package menu;
public class MenuException extends Exception
{
    public MenuException(String choice)
    {
        super(choice);
    }
}