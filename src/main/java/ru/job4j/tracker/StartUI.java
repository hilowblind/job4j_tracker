package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] item = tracker.findAll();
                System.out.println("=== Show all items ====");
                for (Item i : item) {
                    System.out.println("Id: " + i.getId() + ", name: " + i.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Replace an item ====");
                System.out.println("Enter id, which you want to replace:");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter new name:");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Successfully, you replaced an item");
                } else {
                    System.out.println("Error, you entered an incorrect id");
                }
            } else if(select == 3) {
                System.out.println("=== Delete an item ====");
                System.out.println("Enter id, which you want to delete:");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Successfully, you deleted an item");
                } else {
                    System.out.println("Error, you entered an incorrect id");
                }
            } else if (select == 4) {
                System.out.println("=== Find an item by id====");
                System.out.println("Enter an id");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Id: " + id + ", name: " + item.getName());
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find an items by name ====");
                System.out.println("Enter a name:");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length != 0) {
                    System.out.println("Found with name " + name + " next ids:");
                    for (Item i : items) {
                        System.out.println("Id: " + i.getId() + ", name: " + i.getName());
                    }
                } else {
                    System.out.println("Items not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu:");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.print("Select: ");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}