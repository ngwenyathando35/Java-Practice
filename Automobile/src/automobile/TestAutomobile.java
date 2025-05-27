/* Filename TestAutomobile.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This class demonstrates the Automobile objects and demonstrates that all the methods work 
    correctly.
 */
package automobile;
public class TestAutomobile 
{
    public static void main(String[] args) 
    {
        Automobile car = new Automobile(1234, "Mercedes", "G - Wagon", "White ", 2020, 35);
        display(car);
    }
    public static void display(Automobile car) 
    {
        System.out.println("*************************************\n" +  
                "ID number        : " + car.getIdNumber() +
                "\nMake             : " + car.getMake() + 
                "\nModel            : " + car.getModel() + 
                "\nColour           : " + car.getColor() + 
                "\nYear             : " + car.getYear() + 
                "\nLitres per Metre : " + car.getMetresPerLitre());
    }
}