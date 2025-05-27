/*
 * Filename Car.java
 * Written by Thando Ngwenya and the textbook pg 478
 * Written on 26/07/2020
 * Description : This class holds three fields for the CarDemo class. */
package colour;
public class Car 
{
    private int year;
    private Model model;
    private Colour colour;
    public Car(int yr, Model m, Colour c)
    {
        year = yr;
        model = m;
        colour = c;
    }
    public void display()
    {
        System.out.println("Car is : " + year + " " + colour + " " + model);
    }
}