package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ====");
        int idOld = input.askInt("Введите id заявки: ");
        String newName = input.askStr("Введите новое имя заявки: ");
        Item itemEdit = new Item(newName);
        if (tracker.replace(idOld, itemEdit)) {
            out.println("Успешно");
        } else {
            out.println("Ошибка");
        }
        return true;
    }
}
