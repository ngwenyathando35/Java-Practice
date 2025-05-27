/* Filename TalkingAnimalDemo.java
 * Written by The Textbook
 * Written on 07Sep2020
 * Description : Abstract classes: Demonstrating Dynamic Method Binding by using a superclass method as a method
        parameter type. Works as intended */
package animal;
public class TalkingAnimalDemo
{
    //public static void main(String[] args)
    {
        Dog dog = new Dog();
        Cow cow = new Cow();
        dog.setName("Ginger");
        cow.setName("Molly");
        talkingAnimal(dog);
        talkingAnimal(cow);
    }
    public static void talkingAnimal(Animal animal)
    {
        System.out.println("Come one. Come all.");
        System.out.println("See the amazing talking animal!");
        System.out.println(animal.getName() + " says");
        animal.speak();
        System.out.println("***************");
    }
}