/*
 * Filename Square.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a child class
 */
package geometricfigure;
public class Square2 extends GeometricFigure2 implements SidedObject
{
    @Override
    public void calcArea() 
    {
        area = height * width;
    }
    @Override
    public void displaySides() 
    {
        System.out.println("Four sides");
    }
}