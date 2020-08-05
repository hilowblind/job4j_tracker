package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItems(Tracker tracker) {
        Item[] item = tracker.findAll();
        System.out.println("=== Show all items ====");
        for (Item i : item) {
            System.out.println("Id: " + i.getId() + ", name: " + i.getName());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Replace an item ====");
        int id = Integer.valueOf(input.askStr("Enter id, which you want to replace:"));
        System.out.println("Enter new name:");
        String name = input.askStr("Enter new name:");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Successfully, you replaced an item");
        } else {
            System.out.println("Error, you entered an incorrect id");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find an item by id====");
        int id = Integer.valueOf(input.askStr("Enter an id"));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Id: " + id + ", name: " + item.getName());
        } else {
            System.out.println("Item not found");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find an items by name ====");
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
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete an item ====");
        int id = Integer.valueOf(input.askStr("Enter id, which you want to delete:"));
        if (tracker.delete(id)) {
            System.out.println("Successfully, you deleted an item");
        } else {
            System.out.println("Error, you entered an incorrect id");
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(), new ShowAction(),
                new ReplaceAction(), new DeleteAction(),
                new FindItemByIdAction(), new FindItemByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}