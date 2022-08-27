package com.my.learn.patterns.factory.factory;

import com.my.learn.patterns.factory.unit.Animal;
import com.my.learn.patterns.factory.unit.Jaguar;

public class JaguarFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Jaguar();
    }
}
