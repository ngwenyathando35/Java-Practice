package integerdemo;
/*
 * Filename IntegerDemo.java
 * Written by The Textbook
 */
public class IntegerDemo
{
    public static void main(String[] args) 
    {
        int aInt = 1234;
        short aShort = 1234;
        byte aByte = 123;
        long aLong = 1234567890987654321L;
        long anotherInt = (aInt * 100000000L);
        
        System.out.println("The int is " + aInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        System.out.println("The anotherInt is " + anotherInt);
    }
}