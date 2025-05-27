/* Filename Book.java
 * Written by Thando Ngwenya
 * Written on 09Sep2020
 * Description : This is an abstract class named Book. It has a String field for the book’s title and a double 
        field for the book’s price. It has a constructor that requires the book title, and two get methods—one 
        that returns the title and one that returns the price. It also has an abstract method named setPrice().
        Works as intended */
package book;
public abstract class Book 
{
    public String title;
    public Double price;
    public Book(String name)
    {
        title = name;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return price;
    }
    public abstract void setPrice();
}