package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[size++] = item;
        return item;
    }

    private String generateId() {
        return String.valueOf(ids++);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int sizeKeysArray = 0;
        Item[] itemWithKey = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                itemWithKey[sizeKeysArray] = item;
                sizeKeysArray++;
            }
        }
        return Arrays.copyOf(itemWithKey, sizeKeysArray);
    }

    public Item findById(String id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}