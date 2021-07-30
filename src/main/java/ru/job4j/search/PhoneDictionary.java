package ru.job4j.search;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> hasName = Person -> Person.getName().contains(key);
        Predicate<Person> hasSurname = Person -> Person.getSurname().contains(key);
        Predicate<Person> hasPhone = Person -> Person.getPhone().contains(key);
        Predicate<Person> hasAddress = Person -> Person.getAddress().contains(key);
        Predicate<Person> combine = hasName.or(hasSurname).or(hasPhone).or(hasAddress);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
