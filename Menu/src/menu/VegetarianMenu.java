/* Exception Handling
 * Filename VegetarianMenu.java
 * Written by Thando Ngwenya ft the textbook pg 644
 * Written on 19Oct2020
 * Description : Demonstrating Extending a class that can Catch Exceptions. The proper description is in the 
        Menu class. This class inherits from that class. It just overides the constructor with menu options only
        */
package menu;
public class VegetarianMenu extends Menu
{
    String[] vegEntreeChoice = {"Spinach Lasagna","Cheese Enchiladas", "Fruit Plate"};
    public VegetarianMenu()
    {
        super();
        for(int x = 0; x < vegEntreeChoice.length; ++x)
            entreeChoice[x] = vegEntreeChoice[x];
    }
}