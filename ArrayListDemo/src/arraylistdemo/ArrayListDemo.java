/* Filename ArrayListDemo.java
 * Written by Java Programming
 * Description : In the application, an ArrayList is created and Abigail is added to the list. The ArrayList is
    passed to a display() method that displays the current list size and all the names in the list. The initial 
    size is of the ArrayList is 1, and the array contains just one name.         */
package arraylistdemo;
import java.util.ArrayList;
public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Abigail");
        display(names);
        names.add("Brian");
        display(names);
        names.add("Zachary");
        display(names);
        names.add(2, "Christy");
        display(names);
        names.remove(1);
        display(names);
        names.set(0, "Annette");
        display(names);
    
    }
    
    public static void display(ArrayList<String> names)
    {
        System.out.println("\nThe size of the list is " + names.size());
        for(int x = 0; x < names.size(); ++x)
            System.out.println("position " + x + " Name: " +  names.get(x));
    }
}