/*
 * Filename Athlete.java
 * Written by Thando Ngwenya
 * Written on 23Sep2020
 * Description : This is a child class that implements the run method from the Runner interface.
 */
package runner;
public class Athlete implements Runner
{
    @Override
    public void run() 
    {
        System.out.println("An athlete runs physically using his/her legs");
    }
}