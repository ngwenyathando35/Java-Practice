package paintcalculator;
import java.util.Scanner;
/*
 * Filename PaintCalculator.java
 * Written by Thando Ngwenya
 * Written on 10/04/2020
 * Description : 
 */
public class PaintCalculator 
{
    public static void main(String[] args) 
    {
        double num = square(2);
        System.out.println(num);
    }

    private static double square(int i) 
    {
        int square = i * i;
        return square;
    }
}