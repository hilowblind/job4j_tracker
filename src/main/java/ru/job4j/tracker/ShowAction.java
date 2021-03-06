package ru.job4j.tracker;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (Item i : item) {
            out.println("Id: " + i.getId() + ", name: " + i.getName());
        }
        return true;
    }
}