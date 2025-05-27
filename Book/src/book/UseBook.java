/* The program works but it's giving me null instead of the Titles of the books
 * Filename UseBook.java
 * Written by Thando Ngwenya
 * Written on 09Sep2020
 * Description : This is an application demonstrating abstract classes and inheritance. It creates both a Fiction
        and a NonFiction Book, and displays their fields.
 */
package book;
public class UseBook 
{
    public static void main(String[] args) 
    {
        Fiction fictionBook = new Fiction("Book1");
        NonFiction nonFictionBook = new NonFiction("Book2");
        fictionBook.setPrice();
        nonFictionBook.setPrice();
        System.out.println(fictionBook.toString());
        System.out.println(nonFictionBook.toString());
    }
}