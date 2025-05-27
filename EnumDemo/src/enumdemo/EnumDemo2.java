/* Filename EnumDemo2.java
 * Written by Java Programming pg 476
 * Description : Demonstraring enumerations. Enumerations can be used to control a switch structure. This program
    contains a class that declares a Property enumeration for a real estate company. It assigns one of the values
    to a Property variable and then uses a switch structure to display an appropriate message. */
package enumdemo;
public class EnumDemo2
{
    enum Property {SINGLE_FAMILY, MULTIPLE_FAMILY, CONDOMINIUM, LAND, BUSINESS};
    public static void main(String[] args)
    {
        Property propForSale = Property.MULTIPLE_FAMILY;
        switch(propForSale)
        {
            case SINGLE_FAMILY:
            case MULTIPLE_FAMILY:
                System.out.println("Listing fee is 5%");
                break;
            case CONDOMINIUM:
                System.out.println("Listing fee is 6%");
                break;
            case LAND:
            case BUSINESS:
                System.out.println("We do not handle this type of property");
        }
    }
}