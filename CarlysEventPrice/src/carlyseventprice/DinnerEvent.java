/* Filename DinnerEvent.java
 * Written by Thando Ngwenya pg 535
 * Written on 06Sep2020
 * Description : This is a child class that is derived from the Event class. It has four new integer fields that 
        represent numeric choices for an entrée, two side dishes, and a dessert for each DinnerEvent object. It 
        also has three final arrays that contain String menu options for entrées, side dishes, and desserts, and 
        store at least three choices in each array. It has a  constructor that requires arguments for an event 
        number and number of guests, and integer menu choices for one entrée, two side dishes, and one dessert. 
        It passes the first two parameters to the Event constructor, and assigns the last four parameters to the
        appropriate local fields. It also includes a getMenu() method that builds and returns a String including
        the Strings for the four menu choices. Works as intended */
package carlyseventprice;
public class DinnerEvent extends Event
{
    private int sideDish1, sideDish2, dessert, entree;
    private final String[] entrees = {"Hardbody Chicken", "Mac and Cheese", "Rice and Stew"};
    private final String[] sideDishes1 = {"Sliders", "Nuggets", "Oysters"};
    private final String[] sideDishes2 = {"Flash", "Tongue", "Karapau"};
    private final String[] desserts = {"Ice Cream", "Custard and Jelly", "Chocolate Pudding"};
    public DinnerEvent(String eventNum, int numGuests, int entree, int sideDish1, int sideDish2, int dessert)
    {
        super(eventNum, numGuests);
        entree = this.entree;
        sideDish1 = this.sideDish1;
        sideDish2 = this.sideDish2;
        dessert = this.dessert;
        getMenu();
    }
    private void getMenu() 
    {
        System.out.println("Please select an option for your first side dish");
        for (String x : sideDishes1)
            System.out.println(x);
        System.out.println("Please select an option for your second side dish");
        for (String x : sideDishes2)
            System.out.println(x);
        System.out.println("Please select an option for your entree");
        for (String x : entrees)
            System.out.println(x);
        System.out.println("Please select an option for your dessert");
        for (String z : desserts)
            System.out.println(z);
    }
}