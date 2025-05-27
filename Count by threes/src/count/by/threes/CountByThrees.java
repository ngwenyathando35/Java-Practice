/* Filename CountByThrees.java
 * Written by Thando Ngwenya
 * Written on 12/05/2020
 * Description : The application counts by three from 3 through 300 inclusive, and starts a new line after every 
    multiple of 30
 */
package count.by.threes;
public class CountByThrees 
{
    public static void main(String[] args) 
    {
        for(int num = 3; num <= 300; num += 3)
        {
            if(num % 30 == 0)
                System.out.println(num + " ");
            else    
                System.out.print(num + " ");
        }
    }
}