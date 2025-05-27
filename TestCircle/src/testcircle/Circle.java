/* Filename Circle.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : This class has fields named radius, diameter, and area. It includes a constructor that sets the
                 radius to 1 and calculates the other two values. It also includes methods named setRadius()and 
                 getRadius(). The setRadius() method not only sets the radius, it also calculates the other two 
                 values. */
package testcircle;
public class Circle 
{
    double area;
    double radius;
    double diameter;
    public Circle()
    {
        radius = 1;
        //The area of a circle is pi multiplied by the square of the radius.
        area = Math.PI * (radius * radius);
        //The diameter of a circle is twice the radius, 
        diameter = 2 * radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
        area = Math.PI * (radius * radius) ;
        diameter = 2 * radius;
    }
    public double getRadius()
    {
        return radius;     
    }
    public double getDiameter()
    {
        return diameter;     
    }
    public double getArea()
    {
        return area;     
    }
}