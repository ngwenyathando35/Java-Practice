/* Filename WorkingDog.java
 * Written by The TExtbook pg 567
 * Written on 08Sep2020
 * Description : Demonstrating inheriting classes while implementing Interfaces. It should work as intended */
package animal;
public class WorkingDog extends Dog implements Worker
{
    private int hoursOfTraining;
    public void setHoursOfTraining(int hrs)
    {
        hoursOfTraining = hrs;
    }
    public int getHoursOfTraining()
    {
        return hoursOfTraining;
    }
    @Override // The implemented method must always override the parent.
    public void work()
    {
        speak();
        System.out.println("I am a dog who works");
        System.out.println("I have " + hoursOfTraining + " hours of professional training!");
    }
}