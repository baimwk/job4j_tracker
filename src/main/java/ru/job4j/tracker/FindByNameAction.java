package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        String nameFind = input.askStr("Введите имя заявки: ");
        Item[] itemFindByName = tracker.findByName(nameFind);
        if (itemFindByName.length != 0) {
            for (Item value : itemFindByName) {
                out.println(value);
            }
        } else {
            out.println("Заявки с таким name не найдены");
        }
        return true;
    }
}
