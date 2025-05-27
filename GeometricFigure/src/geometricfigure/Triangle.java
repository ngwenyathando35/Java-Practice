/* Filename Triangle.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a child class that overrides it's parents methods. Works as intended */
package geometricfigure;
public class Triangle extends GeometricFigure
{
    @Override
    public void calcArea() 
    {
        area = (width/2) * height;
    }
}