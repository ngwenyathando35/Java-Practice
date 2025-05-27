/*
 * Filename Square.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a child class
 */
package geometricfigure;
public class Square extends GeometricFigure
{
    
    @Override
    public void calcArea() 
    {
        area = height * width;
    }
}