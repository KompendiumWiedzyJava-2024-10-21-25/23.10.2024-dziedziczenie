package com.comarch.szkolenia.dziedziczenie.finalistatic;

public class App2 {
    public static void main(String[] args) {
        /*Bus bus = new Bus();
        bus.x = 6;*/

        //
        //
        //
        //
        Bus.x = 8;

        Variables.currentUsers = 5;

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        Bus.x = 5;
        bus1.x = 7;
        bus2.x = 8;

        System.out.println(Bus.x);
        System.out.println(bus1.x);
        System.out.println(bus2.x);
    }
}
