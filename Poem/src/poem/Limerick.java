/* Filename Limerick.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a subclass of the Poem class. The constructor a title; the lines field is set using a 
                 constant value. A limerick has five lines. Works as intended */
package poem;
public class Limerick extends Poem
{
    private String title;
   public Limerick(String title)
   {
       super(title, 5);
       this.title = title;
   }
}