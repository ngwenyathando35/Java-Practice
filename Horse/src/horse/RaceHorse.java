/* Filename RaceHorse.java
 * Written by Thando Ngwenya
 * Written on 18/08/2020
 * Description : Demonstrating Inheritance. This is a subclass which contains an additional field that holds the 
                 number of races in which the horse has competed and additional methods to get and set the new 
                 field. Works as intended */
package horse;
public class RaceHorse extends Horse
{
    private int numRaces;
    public void setNumOfRaces(int numOfRaces)
    {
        numRaces = numOfRaces;
    }
    public int getNumOfRaces()
    {
        return numRaces;
    }
}