package com.my.learn;

import com.my.learn.patterns.builder.first.Product;
import com.my.learn.patterns.builder.second.Car;
import com.my.learn.patterns.singleton.Sinleton;
import com.my.learn.patterns.strategy.Breakfast;
import com.my.learn.patterns.strategy.Sleep;
import com.my.learn.patterns.strategy.Work;
import com.my.learn.patterns.strategy.entity.Human;


public class MyClass {

    public static void main(String[] args) {

        // Strategy *************************
        System.out.println();
        System.out.println("*** Strategy ***");

        Human vasily = new Human();

        vasily.setActivity(new Breakfast());
        vasily.process();

        vasily.setActivity(new Work());
        vasily.process();

        vasily.setActivity(new Sleep());
        vasily.process();

        // Singleton ************************
        System.out.println();
        System.out.println("*** Singleton ***");

        Sinleton singleton1 = Sinleton.getInstance();
        System.out.println(singleton1.getName());
        singleton1.setName("John");
        System.out.println(singleton1.getName());

        Sinleton singleton2 = Sinleton.getInstance();
        System.out.println(singleton2.getName());

        // Builder **********************************
        System.out.println();
        System.out.println("*** Builder ***");

        Product product = new Product.Builder()
                .buildName("Cheese")
                .buildDescription("Gouda")
                .buildPrice(100)
                .build();

        System.out.println(product);

        // Builder **********************************
        System.out.println();
        System.out.println("*** Builder-2 ***");

        Car car = new Car
                .Builder()
                .buildType("Sport")
                .buildHorsePower(300)
                .buildHasRoof(false)
                .build();

        System.out.println(car);
    }
}
