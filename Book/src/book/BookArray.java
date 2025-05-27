/*
 * Filename BookArray.java
 * Written by Thando Ngwenya
 * Written on 10Sep2020
 * Description : This is an application named BookArray in which an has array that holds 10 Books, some Fiction 
        and some NonFiction is created. It then uses a for loop to display details about all 10 books
 */
package book;
public class BookArray 
{
    public static void main(String[] args) 
    {
        Fiction fic1 = new Fiction("Fic1");
        fic1.setPrice();
        Fiction fic2 = new Fiction("Fic2");
        fic2.setPrice();
        Fiction fic3 = new Fiction("Fic3");
        fic3.setPrice();
        Fiction fic4 = new Fiction("Fic4");
        fic4.setPrice();
        Fiction fic5 = new Fiction("Fic5");
        NonFiction nonfic1 = new NonFiction("nonFic1");
        nonfic1.setPrice();
        NonFiction nonfic2 = new NonFiction("nonFic2");
        nonfic2.setPrice();
        NonFiction nonfic3 = new NonFiction("nonFic3");
        nonfic3.setPrice();
        NonFiction nonfic4 = new NonFiction("nonFic4");
        nonfic4.setPrice();
        NonFiction nonfic5 = new NonFiction("nonFic5");
        nonfic5.setPrice();
        Book BookArray;
        BookArray = {fic1,fic2,fic3,fic4,fic5};
        System.out.println(fictionBook.toString());
        System.out.println(nonFictionBook.toString());
    }
}