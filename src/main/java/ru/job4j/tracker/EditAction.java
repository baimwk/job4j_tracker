package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int idOld = input.askInt("Введите id заявки: ");
        String newName = input.askStr("Введите новое имя заявки: ");
        Item itemEdit = new Item(newName);
        if (tracker.replace(idOld, itemEdit)) {
            System.out.println("Успешно");
        } else {
            System.out.println("Ошибка");
        }
        return true;
    }
}
