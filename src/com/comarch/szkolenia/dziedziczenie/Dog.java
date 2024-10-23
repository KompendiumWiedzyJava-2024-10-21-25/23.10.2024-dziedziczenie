package com.comarch.szkolenia.dziedziczenie;

public class Dog extends Pet {
    String ballColor;

    public Dog() {
        super("asdfg", "sad", 10);
        System.out.println("Konstruktor psa !!!!");
    }

    void x() {
        this.setRace("cos");
    }

    public String getBallColor() {
        return ballColor;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }
}
