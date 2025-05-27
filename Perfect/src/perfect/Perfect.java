/* Filename Perfect.java
 * Written by Thando Ngwenya
 * Written on 12/05/2020
 * Description : This application displays every perfect number from 1 through 1,000. 
 */
//Its not doing the things that need to be done
package perfect;
public class Perfect 
{
    public static void main(String[] args) 
    {
        final int LIMIT = 100;
        int sum = 0;
        for(int num = 1 ; num < LIMIT; num++)
        {
            for(int j = 2; j <= num; j++)
            {
                if(sum == num)
                    System.out.println("Perfect num >> " + sum);
            }
        }
    }
}