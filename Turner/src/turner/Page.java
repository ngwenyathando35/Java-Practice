/* Filename Page.java
 * Written by Thando Ngwenya
 * Written on 22Sep2020
 * Description : This is a class named Page that implements turn() to display “Going to the next page”. Works as 
        intended*/
package turner;
public class Page implements Turner
{
    @Override
    public void turn() 
    {
        System.out.println("Going to the next page");
    }
}