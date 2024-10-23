package com.comarch.szkolenia.dziedziczenie;

public class Cat extends Pet {

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cat)) {
            return false;
        }
        return this.getId() == ((Cat) obj).getId();
    }


}
