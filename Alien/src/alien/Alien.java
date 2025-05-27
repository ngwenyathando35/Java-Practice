/* Filename Alien.java
 * Written by Thando Ngwenya
 * Written on 05Sep2020
 * Modified on 30Sep2020 to be abstract
 * Description : This is an Alien class that has has three protected fields about an alien. It includes a 
        constructor that requires a value for each data field and a toString() method that returns a String 
        containing a complete description of the Alien. Works as intended */
package alien;
public abstract class Alien 
{
    protected int numEyes, numHands;
    protected String color;
    public Alien(int numEyes, int numHands, String color)
    {
        this.numEyes = numEyes;
        this.numHands = numHands;
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "This is an alien that has " + numEyes + " eyes, " + numHands +
            " hands and is " + color + " in color";
    }
}