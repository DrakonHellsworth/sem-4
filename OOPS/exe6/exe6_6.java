//Develop a Java program to demonstrate runtime polymorphism using an array of objects. Use class Animal and subclasses Dog and Cat.
class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}
public class exe6_6
{
    public static void main(String args[])
    {
        Animal[] animals=new Animal[3];
        animals[0]=new Animal();
        animals[1]=new Dog();
        animals[2]=new Cat();
        for (Animal animal:animals)
        {
            animal.sound();
        }
    }
}
//Observation: In the above code, we have a superclass Animal with a method sound() that prints "Animal makes a sound." The subclasses Dog and Cat extend Animal and override the sound() method to print "Dog barks" and "Cat meows" respectively. In the main method, we create an array of Animal objects and assign instances of Animal, Dog, and Cat to it. We then use a for-each loop to iterate through the array and call the sound() method on each object. This demonstrates runtime polymorphism in Java, as the method that gets called is determined at runtime based on the actual object type (Animal, Dog, or Cat) rather than the reference type (Animal).