/* Filename GeometricFigure.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is an abstract class. Each figure includes a height, a width, a figure type, and an area. It
        includes an abstract method to determine the area of the figure. Works as intended */
package geometricfigure;
public abstract class GeometricFigure2
{
    protected int height, width;
    protected String type;
    protected double area;
    public abstract void calcArea();
}