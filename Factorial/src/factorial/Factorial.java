/* Filename Factorial.java
 * Written by Thando Ngwenya
 * Written on 12/05/2020
 * Description : This application displays the factorial for every integer value from 1 to 10.
even though its not displaying them. It just give the answer straight
 */
package factorial;
public class Factorial 
{
    public static void main(String[] args) 
    {
        int num = 10, count, answer = 1;
        if(num > 0)
        {
            for(count = 1; count <= num; count++)
            {
                int anum;
                answer = answer * count;
                anum = num;
                System.out.println("Factorial of " + anum + " is " + answer);
                --anum;
            }
        }
    }    
}