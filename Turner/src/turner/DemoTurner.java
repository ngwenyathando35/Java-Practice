/* Filename Turner.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is an application named DemoTurners that creates one object of each of these class types and
        demonstrates the turn() method for each class. Works as intended*/
package turner;
public class DemoTurner 
{
    //public static void main(String[] args) 
    {
        Leaf leafa  = new Leaf();
        Page pager  = new Page();
        Flipping  f = new Flipping();
        leafa.turn();
        pager.turn();
            f.turn();
    }
}