package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ====");
        int idDelete = input.askInt("Введите id заявки: ");
        if (tracker.delete(idDelete)) {
            out.println("Успешно");
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
