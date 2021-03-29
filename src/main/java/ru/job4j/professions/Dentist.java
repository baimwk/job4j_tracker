package ru.job4j.professions;

public class Dentist extends Doctor {
    private int numberOfTeethHealed;

    public Dentist(String name, String surname, String education, String birthday, String qualification, int numberOfTeethHealed) {
        super(name, surname, education, birthday, qualification);
        this.numberOfTeethHealed = numberOfTeethHealed;
    }

    public int getNumberOfTeethHealed () { return numberOfTeethHealed; }
}
