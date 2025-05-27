/* Filename CarDemo.java
 * Written by Thando Ngwenya and the textbook
 * Written on 26/07/2020
 * Description : Demonstrating Enumerations. Works as intended*/
package colour;
public class CarDemo 
{
    public static void main(String[] args) 
    {
        Car firstCar = new Car(2012, Model.MINIVAN, Colour.BLUE);
        Car secondcar = new Car(2014, Model.CONVERTIBLE,Colour.RED);
        firstCar.display();
        secondcar.display();
    }
}