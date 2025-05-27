/* Filename Limerick.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a subclass of the Poem class. The constructor a title; the lines field is set using a 
                 constant value. A haiku has three lines. Works as intended */
package poem;
public class Haiku extends Poem
{
    private String title;
   public Haiku(String title)
   {
       super(title, 3);
       this.title = title;
   }
}