package com.firstPack;

class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Gav! Gav!");
    }
}

class DogTestDrive {
    public static void main (String[] args) {
        //Проверочный код для класса Dog
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}