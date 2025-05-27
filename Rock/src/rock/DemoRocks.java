/* Filename Demo.java
 * Written by Thando Ngwenya
 * Written on 29/08/2020
 * Description : This is an application that instantiates an object of each type of Rock music and then 
        demonstrates that the methods work appropriately. Works as intended;
 */
package rock;
public class DemoRocks
{
    public static void main(String[] args) 
    {
        IgneousRock igi = new IgneousRock(1,2);
        SedimentaryRock sedi = new SedimentaryRock(3,4);
        MetamorphicRock morph = new MetamorphicRock(5,6);
        display(igi);
        display(sedi);
        display(morph);
    }
    private static void display(Rock data) 
    {
        String name = data.getDescription();
        int num = data.getNumSamples();
        double mass = data.getWeight();
        System.out.println("Rock Music Details"
                       + "\nDescription     : " + name
                       + "\nWeight in grams : " + mass
                       + "\nSamples         : " + num + "\n");
    }
}