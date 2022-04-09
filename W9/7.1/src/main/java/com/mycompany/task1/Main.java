
package com.mycompany.task1;

/**
 *
 * @author FAKHRI
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Horse(), new Cat(), new Animal() };
        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}