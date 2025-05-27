/* Filename NonMetalElement.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This is a child class. It contains a describeElement() method that displays the details of the 
        element and a brief explanation of the properties of the element type. Works as intended*/
package element;
public class NonMetalElement extends Element
{
    public NonMetalElement(String sym, int num, double mass) 
    {
        super(sym, num, mass);
    }
    @Override
    public void describeElement() 
    {
        System.out.println("Nonmetals are poor conductors of electricity and has some properties"
                + " which I didn't explain.");
    }
}