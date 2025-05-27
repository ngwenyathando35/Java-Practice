/* Filename Element.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This is an abstract class that holds properties of elements, including their symbol, atomic 
        number, and atomic weight. It has a constructor that requires values for all three properties and a get 
        method for each value. It also has an abstract method named describeElement().
 */
package element;
public abstract class Element 
{
    private String symbol;
    private int atomicNum;
    private double atomicMass;
    public Element(String sym, int num, double mass)
    {
        symbol = sym;
        atomicNum = num;
        atomicMass = mass;
    }
    public String getSymbol()
    {
        return symbol;
    }
    public int getAtomicNumber()
    {
        return atomicNum;
    }
    public double getMass()
    {
        return atomicMass;
    }
    public abstract void describeElement();
}