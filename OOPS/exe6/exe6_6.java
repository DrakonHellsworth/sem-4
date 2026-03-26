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