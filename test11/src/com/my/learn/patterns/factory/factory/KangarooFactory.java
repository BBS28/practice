package com.my.learn.patterns.factory.factory;

import com.my.learn.patterns.factory.unit.Animal;
import com.my.learn.patterns.factory.unit.Kangaroo;

public class KangarooFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Kangaroo();
    }
}
