/*
 * Filename Book.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a class that implements turn() to display “Changing the book”. Works as intended*/
package turner;
class Book implements Turner
{
    @Override
    public void turn()
    {
        System.out.println("Changing the book");
    }
    
}