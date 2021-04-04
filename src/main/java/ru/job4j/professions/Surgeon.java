package ru.job4j.professions;

public class Surgeon extends Doctor {
    private int numberOfKnives;

    public Surgeon(String name, String surname, String education,
                   String birthday, String qualification, int numberOfKnives) {
        super(name, surname, education, birthday, qualification);
        this.numberOfKnives = numberOfKnives;
    }

    public int getNumberOfKnives() {
        return numberOfKnives; }

    public boolean loveCarving() {
        return true; }
}
