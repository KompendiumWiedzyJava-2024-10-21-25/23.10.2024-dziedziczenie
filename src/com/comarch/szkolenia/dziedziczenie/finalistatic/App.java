package com.comarch.szkolenia.dziedziczenie.finalistatic;

import com.comarch.szkolenia.dziedziczenie.Car;

public class App {
    public static void main(String[] args) {
        final int x = 5;
        //x = 7;

        System.out.println(x);

        final Car car = new Car("BMW", "3", "KR11"); // 158
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPlate());

        car.setBrand("Audi");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPlate());

        //car = new Car("Toyota", "Corolla", "KR22");
        final int i = 0;
        for(int j = 0; j < 10; j++) {

        }

        AppSettings.dbIp = "asdf";

        //int i = 0;
        //i = 7;

        Variables.currentUsers = Variables.currentUsers + 1;

        Variables.funkcja();

        System.out.println(AppSettings.dbIp);
    }

    public void cos() {
        int i = 7;
        Car car = new Car("Toyota", "Corolla", "KR22");
    }
}
