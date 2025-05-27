/* Filename CompareLoopTimes.java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : The filename is self explanatory
 */
package comparelooptimes;
import java.time.LocalDateTime;
public class CompareLoopTimes 
{
    public static void main(String[] args) 
    {
        int startTime, endTime;
        final int REPEAT = 50_000;
        final int FACTOR = 1_000_000;
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();
        for (int x = 0; x <= REPEAT; ++x);
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time with prefix increment: "
                + ((endTime - startTime) / FACTOR) + " milliseconds");
        now = LocalDateTime.now();
        startTime = now.getNano();
        for (int x = 0; x <= REPEAT; x++);
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time with postfix increment: "
                + ((endTime - startTime) / FACTOR) + " milliseconds");
    }
}
