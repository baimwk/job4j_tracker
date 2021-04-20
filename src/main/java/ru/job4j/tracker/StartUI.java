package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            switch (select) {
                case (0):
                    StartUI.createItem(input, tracker);
                    break;
                case (1):
                    StartUI.showAllItem(tracker);
                    break;
                case (2):
                    StartUI.editItem(input, tracker);
                    break;
                case (3):
                    StartUI.deleteItem(input, tracker);
                    break;
                case (4):
                    StartUI.findItemById(input, tracker);
                    break;
                case (5):
                    StartUI.findItemsByName(input, tracker);
                    break;
                case (6):
                    System.out.println("=== Exit Program ====");
                    run = false;
                    break;
                default:
                    System.out.println("Выберите пункт меню");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItem(Tracker tracker) {
        System.out.println("=== Show all Items ====");
        Item[] items = tracker.findAll();
        for (Item value : items) {
            System.out.println(value);
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int idOld = Integer.valueOf(input.askStr("Введите id заявки: "));
        String newName = input.askStr("Введите новое имя заявки: ");
        Item itemEdit = new Item(newName);
        if (tracker.replace(idOld, itemEdit)) {
            System.out.println("Успешно");
        } else {
            System.out.println("Ошибка");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int idDelete = Integer.valueOf(input.askStr("Введите id заявки: "));
        if (tracker.delete(idDelete)) {
            System.out.println("Успешно");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int idFind = Integer.valueOf(input.askStr("Введите id заявки: "));
        Item itemFind = tracker.findById(idFind);
        if (itemFind != null) {
            System.out.println(itemFind);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String nameFind = input.askStr("Введите имя заявки: ");
        Item[] itemFindByName = tracker.findByName(nameFind);
        if (itemFindByName.length != 0) {
            for (Item value : itemFindByName) {
                System.out.println(value);
            }
        } else {
            System.out.println("Заявки с таким name не найдены");
        }
    }

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
        System.out.println("Find by Id = 2: " + tracker.findById(2));
        System.out.println(item);

        Input input = new ConsoleInput();
        Tracker tracker4 = new Tracker();
        new StartUI().init(input, tracker4);

        Input input1 = new ConsoleInput();
        Tracker tracker5 = new Tracker();
        /*Вызов не статического метода. Необходимо обратиться через объект. */
        new StartUI().init(input1, tracker5);
        /* Вызов статического метода. Обращаемся через класс. */
        StartUI.createItem(input1, tracker5);
    }
}
