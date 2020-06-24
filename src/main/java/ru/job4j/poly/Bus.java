package ru.job4j.poly;

import java.security.spec.RSAOtherPrimeInfo;

public class Bus implements Transport{

    @Override
    public void toGo() {
        System.out.println("Bus is going");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Passengers entered: " + passengers);
    }

    @Override
    public double toFill(int volume) {
        double price = 8.09;
        return volume * price;
    }
}
