package com.comarch.szkolenia.dziedziczenie;

import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setId(10);
        cat.setName("Puszek");
        cat.setRace("Jakis");
        cat.setAge(10);
        Object object = new Cat();
        Object o2 = new Random();
        Object o3 = new String("cos");

        Cat cat2 = new Cat();
        cat2.setId(10);

        System.out.println(cat.equals(cat2));

        cat.equals(new Cat());

        System.out.println(cat);
        System.out.println(cat2);


        Car car = new Car("BMW", "3", "KR2222");
        System.out.println(car);
    }
}
