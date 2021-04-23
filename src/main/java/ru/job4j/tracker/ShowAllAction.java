package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all Items ====");
        Item[] items = tracker.findAll();
        for (Item value : items) {
            System.out.println(value);
        }
        return true;
    }
}
