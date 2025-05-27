/*
 * Filename Machine.java
 * Written by Thando Ngwenya
 * Written on 23Sep2020
 * Description : This is a child class that implements the run method from the Runner interface.
 */
package runner;
public class Machine implements Runner
{
    @Override
    public void run() 
    {
        System.out.println("A machine runs by performing a task");
    }
}