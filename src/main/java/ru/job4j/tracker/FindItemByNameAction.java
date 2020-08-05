package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find an items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter a name:");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            System.out.println("Found with name " + name + " next ids:");
            for (Item i : items) {
                System.out.println("Id: " + i.getId() + ", name: " + i.getName());
            }
        } else {
            System.out.println("Items not found");
        }
        return true;
    }
}