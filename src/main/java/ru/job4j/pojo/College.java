package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Ivan Velikiy");
        student1.setGroup(121);
        student1.setDayOfEntrance(22);
        student1.setMonthOfEntrance("August");
        student1.setYearOfEntrance(2020);

        student1.display();
    }
}
