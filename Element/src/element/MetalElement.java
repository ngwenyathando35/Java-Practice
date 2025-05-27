/*
 * Filename MetalElement.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This is a child class that contains a describeElement() method that displays the details of an 
        element and a brief explanation of the properties of the element type. Works as intended */
package element;
public class MetalElement extends Element
{
    public MetalElement(String sym, int num, double mass) 
    {
        super(sym, num, mass);
    }
    @Override
    public void describeElement() 
    {
        System.out.println("It is a good conductor of electricity and has some other properties "
                + "which I didn't desribe");
    }
}