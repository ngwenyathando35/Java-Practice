/* Filename Inspections.java
 * Written by Thando Ngwenya
 * Written on 17/05/2020
 * Description :This application determines which factory will be selected each week for the next 52 weeks 
    randomly. After each selection, it displays the factory to inspect, and after the 52 selections are complete,
    it displays the percentage of inspections at each factory for the year. 
 */
package inspections;
public class Inspections 
{
    public static void main(String[] args) 
    {
        double one = 0, two = 0, three = 0, four = 0,  percentage;
        int factory;
        final int NUM_OF_FACTORIES = 4;
        final int WEEKS = 52;
        for(int i = 1; i < WEEKS; i++)
        {
            factory = 1 + (int) (Math.random() * NUM_OF_FACTORIES);
            switch (factory) 
            {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
            }
        }
        int percentage1 = (int)((one/52) * 100);
        int percentage2 = (int)((two/52) * 100);
        int percentage3 = (int)((three/52) * 100);
        int percentage4 = (int)((four/52) * 100);

        System.out.println("Factory one was inspected " + one + " times which was " + 
                percentage1 + " of the time."); 
        System.out.println("Factory two was inspected " + two + " times which was " + 
                percentage2 + " of the time."); 
        System.out.println("Factory three was inspected " + three + " times which was " + 
                percentage3 + " of the time."); 
        System.out.println("Factory four was inspected " + four + " times which was " + 
                percentage4 + " of the time."); 
    }
}