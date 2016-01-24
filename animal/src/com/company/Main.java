package com.company;

public class Main {

    public static void main(String[] args) {
        short a = 1, b = 2, c = 3, d = 4;
        Animal animal1 = new Animal(20, a, "Bear");
        Animal animal2 = new Animal(20, b, "Wolf");
        Animal animal3 = new Animal(20, c, "Deer");
        Animal animal4 = new Animal(20, d, "Kaban");
        animal1.eat(animal2);
        animal2.eat("apple");
        animal2.eat("apple");
        animal2.eat("apple");
    }
}
