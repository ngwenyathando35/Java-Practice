/* NoClassDefinition error
 * Filename Blanket.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This class has fields for a blanket’s size, color, material, and price. It includes a 
        constructor that sets default values for the fields as Twin, white,cotton, and R527,7. It has a set 
        method for each of the first three fields. The method that sets size adds R179.5 to the base price for a
        double blanket, R439.75 for a queen blanket, and R703.6 for a king. The method that sets the material 
        adds R351.8 to the price for wool and R719.55 to the price for cashmere. In other words, the price for a
        king-sized cashmere blanket is R2022,85. Whenever the size or material is invalid, it resets the blanket
        to the default values. It also has a toString() method that returns a description of the blanket.
 */
package blanket;

public class Blanket 
{
    private String color, material, blanketSize;
    private double price;
    public Blanket()
    {
        color = "white";
        this.material = "cotton";
        blanketSize = "twin";
        this.price = 527.7;
    }
    public void setSize(String size)
    {
        blanketSize = size;
        switch(size)
        {
            case "double":
                price += 179.5;
                break;
            case "queen":
                price += 439.75;
                break;
            case "king":
                price += 703.9;
                break;
            default:
                System.out.println("Since the size is invalid, the price will be set to the original price");
                price = 527.7;
        }
    }
    public void setMaterial(String material)
    {
        this.material = material;
        switch(material)
        {
            case "wool":
                price += 351.8;
                break;
            case "cashmere":
                price += 719.55;
                break;
            default:
                System.out.println("Since the material is invalid, the price will be set to the default price");
                price = 527.7;
        }
    }
    public void setColor(String colour)
    {
        color = colour;
    }
    @Override
    public String toString()
    {
        return "This is a " + color + ", " + material + ", " + blanketSize + " blanket."
               + "\nIts default price is R527.7 but because it's you, it's gonna cost you R" + price;
    }
}