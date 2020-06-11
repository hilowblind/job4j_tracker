package ru.job4j.oop;


public class Predator extends Animal {
    String name;

    public Predator() {
        super("Predator");
    }

    public Predator(String name) {
        super();
        this.name = name;
    }
}
