package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction {
    private final Output out;

    public FindItemByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find an item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter an id"));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Id: " + id + ", name: " + item.getName());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}