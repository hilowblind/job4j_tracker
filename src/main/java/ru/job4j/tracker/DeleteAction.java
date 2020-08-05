package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete an item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id, which you want to delete:"));
        if (tracker.delete(id)) {
            System.out.println("Successfully, you deleted an item");
        } else {
            System.out.println("Error, you entered an incorrect id");
        }
        return true;
    }
}