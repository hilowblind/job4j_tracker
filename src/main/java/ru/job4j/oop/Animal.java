package ru.job4j.oop;


public class Animal {
    String name;
    int id;

    public  Animal() {
        id = 0;
        name = "animal";
    }

    public Animal(int id) {
        this.id = id;
        name = "animal";
    }

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Predator predator = new Predator("predator super");
        Tiger tiger = new Tiger();
        System.out.println("Animal's name: " + predator.name + ", animal's id: " + predator.id);
    }
}
