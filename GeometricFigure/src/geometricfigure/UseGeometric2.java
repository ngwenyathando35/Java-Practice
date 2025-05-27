/* Filename UseGeometric.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : It creates objects to demonstrate inheritance, dynamic method binding, polymporthism. It 
        creates figures with height area width and the type of figure. Works as intended */
package geometricfigure;
import java.util.Scanner;
public class UseGeometric2
{
    public static void main(String[] args) 
    {
        Square2 sq = new Square2();
        Triangle2 tr = new Triangle2();
        GeometricFigure2[] figures = new GeometricFigure2[2];
        figures[0] = new Square2();
        figures[1] = new Triangle2();
        promptDetails(figures);
        figures[0].calcArea();
        figures[1].calcArea();
        sq.displaySides();
        tr.displaySides();
        display(figures);
    }
    private static void display(GeometricFigure2[] figures) 
    {
        for (GeometricFigure2 figure : figures) 
        {
            System.out.println("Shape >> " + figure.type + 
                    "\nHeight >> " + figure.height + 
                    "\nWidth >> " + figure.width + 
                    "\nArea >> " + figure.area);
        }
    }
    private static GeometricFigure2[] promptDetails(GeometricFigure2[] figures) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the triangle");
        figures[1].height = sc.nextInt();
        figures[1].type = "Triangle";
        System.out.println("Please enter the width of the figure");
        System.out.println("The figure has " + figures[1]);
        figures[1].width = sc.nextInt();
        System.out.println("Please enter the height of the Square");
        figures[0].height = sc.nextInt();
        figures[0].type = "Square";
        System.out.println("Please enter the width of the figure");
        figures[0].width = sc.nextInt();
        return figures;
    }
}