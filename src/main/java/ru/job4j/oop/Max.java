package ru.job4j.oop;

public class Max {
    public static double max(double first, double second) {
        double max = first > second ? first : second;
        return max;
    }

    public static double max(double first, double second, double third) {
        return max(first, max(second, third));
    }

    public static double max(double first, double second, double third, double fourth) {
        return max(max(first, second), max(third, fourth));
    }
}
