package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int idFind = input.askInt("Введите id заявки: ");
        Item itemFind = tracker.findById(idFind);
        if (itemFind != null) {
            System.out.println(itemFind);
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
