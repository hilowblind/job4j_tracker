package ru.job4j.pojo;

public class Student {
    private String name;
    private int group;
    private int dayOfEntrance;
    private String monthOfEntrance;
    private int yearOfEntrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getDayOfEntrance() {
        return dayOfEntrance;
    }

    public void setDayOfEntrance(int dayOfEntrance) {
        this.dayOfEntrance = dayOfEntrance;
    }

    public String getMonthOfEntrance() {
        return monthOfEntrance;
    }

    public void setMonthOfEntrance(String monthOfEntrance) {
        this.monthOfEntrance = monthOfEntrance;
    }

    public int getYearOfEntrance() {
        return yearOfEntrance;
    }

    public void setYearOfEntrance(int yearOfEntrance) {
        this.yearOfEntrance = yearOfEntrance;
    }

    public void display() {
        System.out.println("Student's name: " + getName());
        System.out.println("Group: " + getGroup());
        System.out.println("Date of entrance: " + getDayOfEntrance() + " " +
                getMonthOfEntrance() + ", " + getYearOfEntrance());
    }
}
