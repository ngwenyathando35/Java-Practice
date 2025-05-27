/* Filename Population.java
 * Written by Thando Ngwenya
 * Written on 17/05/2020
 * Description : In this program, the population of Mexico is 121 million and the population increases 1.01 
    percent annually. The population of the America is 315 million  the population is reduced 0.15 percent 
    annually. The application displays the populations for the two countries every year until the population of 
    Mexico exceeds that of the United States, and also displays the number of years it took
 */
package population;
public class Population 
{
    public static void main(String[] args) 
    {
        long mexPop = 121000000, usaPop = 315000000L; 
        final double MEXICO_INCREASE_PERCENTAGE = 0.101;
        final double USA_REDUCTION_PERCENTAGE = 0.015;
        int yearsItTook = 1;
        while(usaPop > mexPop)
        {
            mexPop += mexPop * MEXICO_INCREASE_PERCENTAGE; 
            usaPop -= usaPop * USA_REDUCTION_PERCENTAGE;
            yearsItTook++;
            System.out.println("American population >> " + usaPop +
                    "\nMexican Population  >> " + mexPop + "\n");
        }
        System.out.println("It took Mexico " + yearsItTook + " years to surpass America's population");
    }
}