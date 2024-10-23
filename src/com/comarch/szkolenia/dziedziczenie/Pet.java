package com.comarch.szkolenia.dziedziczenie;

public class Pet extends A {
    private String name;
    private String race;
    private int age;

    public Pet() {
        super();
        System.out.println("Konstruktor Peta !!");
    }

    public Pet(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public void walk() {
        System.out.println("Ide na czterech lapach !!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
