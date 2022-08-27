package com.my.learn.patterns.factory;

import com.my.learn.patterns.factory.factory.AnimalFactory;
import com.my.learn.patterns.factory.factory.JaguarFactory;
import com.my.learn.patterns.factory.factory.KangarooFactory;
import com.my.learn.patterns.factory.factory.SnakeFactory;
import com.my.learn.patterns.factory.unit.Animal;

public class Zoo {

    private static AnimalFactory animalFactory;

    public static Animal getAnimal(String animal) {
        if (animal.equalsIgnoreCase("jaguar")) {
            animalFactory = new JaguarFactory();
        } else if (animal.equalsIgnoreCase("kangaroo")) {
            animalFactory = new KangarooFactory();
        } else if (animal.equalsIgnoreCase("snake")) {
            animalFactory = new SnakeFactory();
        } else {
            throw new RuntimeException("No such animal in the zoo");
        }

        return animalFactory.createAnimal();
    }

}
