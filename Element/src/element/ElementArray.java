/* Filename ElementArray.java
 * Written by Thando Ngwenya
 * Written on 16Sep2020
 * Description : This application creates and displays an array that holds at least two elements of each type
        Works as intended */
package element;
public class ElementArray 
{
    public static void main(String[] args) 
    {
        NonMetalElement carbon = new NonMetalElement("C", 6, 12.01);
        NonMetalElement oxygen = new NonMetalElement("O", 8, 15.05);
        MetalElement copper = new MetalElement("Cu", 23, 90.05);
        MetalElement iron = new MetalElement("Fe", 28, 22.22);
        MetalElement[] metals = {copper, iron};
        NonMetalElement[] nonMetals = {carbon, oxygen};
        display(metals, nonMetals);
    }
    private static void display(MetalElement[] metals, NonMetalElement[] nonMetals) 
    {
        System.out.println("Metals");
        for(int i = 0; i< metals.length; i++)
        {
            System.out.println("The metal has the symbol " + metals[i].getSymbol() + 
                    "\nIt has the atomic number " + metals[i].getAtomicNumber()
                    + "\nIt weighs " + metals[i].getMass()+ "\n");
            metals[1].describeElement();
        }
        System.out.println("\n");
        System.out.println("NonMetals");
        for(int i = 0; i< metals.length; i++)
        {
            System.out.println("The metal has the symbol " + nonMetals[i].getSymbol() + 
                    "\nIt has the atomic number " + nonMetals[i].getAtomicNumber()
                    + "\nIt weighs " + nonMetals[i].getMass() + "\n");
            nonMetals[1].describeElement();
        }
    }
}