package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item1 = new Item("John");
        Item item2 = new Item("Tom");
        Item item3 = new Item("Mark");
        Item item4 = new Item("Tom");

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        System.out.println("Id's search completed: id = " + tracker.findById("3").getId() +
                ", name is " + tracker.findById("3").getName());
    }
}
