/*
 * Filename Genre.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a class that implements turn() to display “Genre of this book”. Works as intended*/
package turner;
class Genre implements Turner
{
    @Override
    public void turn()
    {
        System.out.println("Genre of this book");
    }
}