package ru.job4j.tracker;

import ru.job4j.inheritance.JSONReport;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime currentDateTime = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущее время: " + currentDateTimeFormat);

        Tracker tracker = new Tracker();
        System.out.println(tracker.add(item));
        System.out.println("Find by Id = 1: " + tracker.findById(1));

        Item item1 = new Item();
        item1.setName("item-1");
        tracker.add(item1);
        Item item2 = new Item();
        item2.setName("item-1");
        tracker.add(item2);
        System.out.println("Find by name item-1: " + tracker.findByName("item-1"));
        tracker.findAll();
    }
}
