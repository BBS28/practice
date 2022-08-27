package com.my.learn.patterns.factory.factory;

import com.my.learn.patterns.factory.unit.Animal;
import com.my.learn.patterns.factory.unit.Snake;

public class SnakeFactory implements AnimalFactory{

    @Override
    public Animal createAnimal() {
        return new Snake();
    }

}
