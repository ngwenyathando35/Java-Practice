/* Filename Couplet.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a subclass of the Poem class. The constructor a title; the lines field is set using a 
                 constant value. A couplet has two lines */
package poem;
public class Couplet extends Poem
{
    private final String title;
   public Couplet(String title)
   {
       super(title, 2);
       this.title = title;
   }
}