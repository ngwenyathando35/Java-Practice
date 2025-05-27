/* Filename DemoPoem.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This application demonstrates usage of an object of each type. Works as intended */
package poem;
public class DemoPoem 
{
    public static void main(String []args)
    {
        Couplet coup = new Couplet("Couplet");
        Limerick lim = new Limerick("Limerick");
        Haiku haik = new Haiku("Haiku");
        System.out.println("A " + lim.getNameOfPoem() + " has " + lim.getNumOfLines() + " lines");
        System.out.println("A " + coup.getNameOfPoem() + " has " + coup.getNumOfLines() + " lines");
        System.out.println("A " + haik.getNameOfPoem() + " has " + haik.getNumOfLines() + " lines");
    }
}