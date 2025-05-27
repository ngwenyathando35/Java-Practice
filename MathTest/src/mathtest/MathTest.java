/*
 * Filename MathTest.java
 * Written by Thando Ngwenya
 * Written on 20/04/2020
 * Description : This application uses the Math class to determine the answers square root,the sine and cosine,
    the floor, ceiling, and round values,the larger and the smaller of a character and an integer of the supplied
    values and a random number between 0 and 20 
 */
package mathtest;
public class MathTest 
{
    public static void main(String[] args) 
    {
        double squareRoot37, sine300, cosine300, floor228, ceiling228, round228, smallerD71, random020;
        squareRoot37 = Math.sqrt(37);
        sine300 = Math.sin(300);
        cosine300 = Math.cos(300);
        floor228 = Math.floor(22.8);
        ceiling228 = Math.ceil(22.8);
        round228 = Math.round(22.8);
        double largerD71 = Math.max('D', 71);
        smallerD71 = Math.min('D', 71);
        random020 = 20*Math.random();
        System.out.println("The square root of 37 is " + squareRoot37 + 
                "\nThe sine of 300 is " + sine300 + 
                "\nThe cosine of 300 is " + cosine300 + 
                "\nThe floor value of 22.8 is " + floor228 + 
                "\nThe ceiling value of 22,8 is " + ceiling228 +
                "\nThe value 22.8 rounded off is " + round228 + 
                "\nThe larger value between the character ‘D’ and the integer 71 is " + largerD71 +
                "\nThe smaller value of the character ‘D’ and the integer 71 is " + smallerD71 +
                "\n A random number between 0 and 20 is " + random020);
    }
}