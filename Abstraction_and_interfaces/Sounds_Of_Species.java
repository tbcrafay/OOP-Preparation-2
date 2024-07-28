/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*Abstraction_and_interfaces:
Create an abstract class Animal with an abstract method makeSound(). Create subclasses Dog, Cat, and Bird that extend Animal and implement the makeSound() method 
accordingly.
Additionally, create an interface Flyable with a method fly(). Make the Bird class implement the Flyable interface.
 */
package Abstraction_and_interfaces;

/**
 *
 * @author Abdul Rafay
 */
abstract class Animal {

    abstract void makeSound();
}

interface Flyable {

    void fly();
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof...Woof!!");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow...meow!!");
    }
}

class Bird extends Animal implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("chirp...chirp...");
    }

    @Override
    public void fly() {
        System.out.println("flying....");
    }
}

public class Sounds_Of_Species {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};

        for (Animal animal : animals) {
            animal.makeSound();

            // Polymorphic behavior - check if the animal can fly
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
        }
    }

}
