/* 
 * Filename Fiction.java
 * Written by Thando Ngwenya
 * Written on 09Sep2020
 * Description : This is a sub class of Book: It has a setPrice() method that sets the price of NonFiction Books 
        to $37.99. It has a constructor  and includes a call to setPrice(). */
package book;
public class NonFiction extends Book
{
    public NonFiction(String title) 
    {
        super(title);
    }
    @Override
    public void setPrice() 
    {
        price = 37.99;
    }
    @Override
    public String toString()
    {
        String a = "The name of the book is " + getTitle() + " and it costs " + getPrice();
        return a;
    }
}