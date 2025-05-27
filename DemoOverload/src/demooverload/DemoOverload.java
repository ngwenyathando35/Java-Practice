package demooverload;
/*
 * Filename DemoOverload.java
 * Written by The Textbook pg 197
 * Written on 15/04/2020
 * Description : To demonstrate Demo overloading 
 */
public class DemoOverload 
{
    public static void main(String[] args) 
    {
        int month = 6, day = 24, year = 2017;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }
    private static void displayDate(int mm)
    {
        System.out.println("Event date " + mm + "/1/2016");
    }
    private static void displayDate(int mm, int dd) 
    {
        System.out.println("Event date " + mm + "/" + dd + "/2016");
    }
    private static void displayDate(int mm, int dd, int yy) 
    {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }
}