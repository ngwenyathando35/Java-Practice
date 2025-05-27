/*
 * Filename PoliticalCandidate.java
 * Written by Thando Ngwenya
 * Written on 23Sep2020
 * Description : This is a child class that implements the run method from the Runner interface.
 */
package runner;
public class PoliticalCandidate implements Runner
{
    @Override
    public void run() 
    {
        System.out.println("A political candidate runs by participating in a political race");
    }
}