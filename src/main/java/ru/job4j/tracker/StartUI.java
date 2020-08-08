package ru.job4j.tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void createItem(Input input, Tracker tracker) {
        out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public void showItems(Tracker tracker) {
        Item[] item = tracker.findAll();
        out.println("=== Show all items ====");
        for (Item i : item) {
            out.println("Id: " + i.getId() + ", name: " + i.getName());
        }
    }

    public void replaceItem(Input input, Tracker tracker) {
        out.println("=== Replace an item ====");
        int id = Integer.valueOf(input.askStr("Enter id, which you want to replace:"));
        out.println("Enter new name:");
        String name = input.askStr("Enter new name:");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Successfully, you replaced an item");
        } else {
            out.println("Error, you entered an incorrect id");
        }
    }

    public void findItemById(Input input, Tracker tracker) {
        out.println("=== Find an item by id====");
        int id = Integer.valueOf(input.askStr("Enter an id"));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println("Id: " + id + ", name: " + item.getName());
        } else {
            out.println("Item not found");
        }
    }

    public void findItemByName(Input input, Tracker tracker) {
        out.println("=== Find an items by name ====");
        String name = input.askStr("Enter a name:");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            out.println("Found with name " + name + " next ids:");
            for (Item i : items) {
                out.println("Id: " + i.getId() + ", name: " + i.getName());
            }
        } else {
            out.println("Items not found");
        }
    }

    public void deleteItem(Input input, Tracker tracker) {
        out.println("=== Delete an item ====");
        int id = Integer.valueOf(input.askStr("Enter id, which you want to delete:"));
        if (tracker.delete(id)) {
            out.println("Successfully, you deleted an item");
        } else {
            out.println("Error, you entered an incorrect id");
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }


    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output), new ShowAction(output),
                new ReplaceAction(output), new DeleteAction(output),
                new FindItemByIdAction(output), new FindItemByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}