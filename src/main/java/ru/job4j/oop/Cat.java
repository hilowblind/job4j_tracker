package ru.job4j.oop;

import java.util.concurrent.Callable;

public class Cat {
    public String name;

    public String food;

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Cat's name:");
        System.out.println(this.name);
        System.out.println("Hi ate:");
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
        String say = gav.sound();
        System.out.println("Peppy says: " + say);
    }
}
