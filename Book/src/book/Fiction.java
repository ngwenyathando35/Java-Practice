/*
 * Filename Fiction.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : This is a child classes of Book. It has a setPrice() method that sets the price for all Books to
        $24.99. It calls a constructor and includes a call to setPrice() which is in the parent class.
 */
package book;
public class Fiction extends Book
{
    public Fiction(String title) 
    {
        super(title);
    }
    @Override
    public String toString()
    {
        String a = "The name of the book is " + title + " and it costs " + getPrice();
        return a;
    }
    @Override
    public void setPrice() 
    {
        price = 24.99;
    }
}