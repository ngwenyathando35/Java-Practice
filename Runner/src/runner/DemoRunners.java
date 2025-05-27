/*
 * Filename DemoRunners.java
 * Written by Thando Ngwenya
 * Written on 24Sep2020
 * Description : This application that demonstrates the use of the classes. The application has an interface with 
        a run method that is implemented by the all the subclasses. The demonstrate how the word run is applied in
        different industries.
 */
package runner;
public class DemoRunners 
{
    public static void main(String[] args) 
    {
        Machine m = new Machine();
        Athlete a = new Athlete();
        PoliticalCandidate p = new PoliticalCandidate();
        m.run();
        a.run();
        p.run();
    }
}