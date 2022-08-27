package com.my.learn.patterns.factory;

import com.my.learn.patterns.factory.unit.Animal;

public class FactoryApp {
    public static void main(String[] args) {

        try {
            Animal animal = Zoo.getAnimal("jaguar");
            animal.go();

            animal = Zoo.getAnimal("snake");
            animal.go();

            animal = Zoo.getAnimal("kangaroo");
            animal.go();

            animal = Zoo.getAnimal("horse");
            animal.go();

        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
