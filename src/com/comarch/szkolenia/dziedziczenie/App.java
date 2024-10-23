package com.comarch.szkolenia.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setAge(10);
        dog.setRace("Owczarek");
        dog.ballColor = "Red";

        dog.walk();

        System.out.println(dog.getName());
        System.out.println(dog.getRace());
        System.out.println(dog.getAge());

        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setAge(10);
        cat.setRace("Dachowiec");

        cat.walk();

        System.out.println(cat.getName());
        System.out.println(cat.getRace());
        System.out.println(cat.getAge());

        cat.setId(10);

        System.out.println(cat.getId());

        new Dog();

        Snake snake = new Snake();

        snake.walk();

        Cat[] cats = new Cat[10];
        Dog[] dogs = new Dog[10];
        Snake[] snakes = new Snake[10];

        cats[0] = new Cat();
        dogs[1] = new Dog();

        Pet[] pets = new Pet[10];
        pets[0] = new Cat();
        pets[1] = new Dog();
        pets[2] = new Snake();


        pets[2].walk();
        pets[1].getAge();
        pets[1].getRace();

        if(pets[1] instanceof Dog) {
            Dog d = (Dog) pets[1];
            d.getBallColor();
        }
    }
}
