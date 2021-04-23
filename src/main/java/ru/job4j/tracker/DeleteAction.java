package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int idDelete = input.askInt("Введите id заявки: ");
        if (tracker.delete(idDelete)) {
            System.out.println("Успешно");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
