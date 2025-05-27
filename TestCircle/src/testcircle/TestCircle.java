/*
 * Filename TestCircle.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : The programs main() method declares three Circle objects. Using the setRadius()method, it 
    assigns one Circle a small radius value, and assigns another a larger radius value. No value is assigned to
    the radius of the third circle so that the value assigned at construction is retained. It then display's all 
    the values for all the Circle objects
Unfortunately for this program, I followed every nstruction from the textbook but the code gives me a null point
Exception error messatge */
package testcircle;
public class TestCircle 
{
    public static void main(String[] args) 
    {
        Circle data1 = new Circle();
        Circle data2 = new Circle();
        Circle data3 = new Circle();
        data1.setRadius(3);
        data2.setRadius(9);
        display(data1, data2, data3);
    }
    private static void display(Circle data1, Circle data2, Circle data3) 
    {
        Circle[] array = new Circle[3];
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Circle" + ++i + " data\n"
                    + "Radius >> " + array[i].getRadius() +
                    "\nArea >> "  +  array[i].getDiameter() +
                    "\nDiameter >> " + array[i].getArea());
        }
    }
}