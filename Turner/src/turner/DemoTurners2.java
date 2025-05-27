/*
 * Filename DemoTurners2.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is an application that creates one object of each of these class types and demonstrates the
        turn() method for each class. */
package turner;
public class DemoTurners2 
{
    public static void main(String[] args) 
    {
        Leaf l = new Leaf();
        Page p = new Page();
        Flipping f = new Flipping();
        Book b = new Book();
        Genre g = new Genre();
        l.turn();
        p.turn();
        f.turn();
        b.turn();
        g.turn();
    }
}