package ru.job4j.professions;

public class Programmer extends Engineer {
    private int hoursForCoding;
    private int hoursForSleeping;

    public Programmer(String name, String surname, String education, String birthday, int yearOfExperience, String[] finishedProjects, int hoursForCoding, int hoursForSleeping) {
        super(name, surname, education, birthday, yearOfExperience, finishedProjects);
        this.hoursForCoding = hoursForCoding;
        this.hoursForSleeping = hoursForSleeping;
    }

    public int getHoursForCoding() { return hoursForCoding; }
    public int getHoursForSleeping() { return hoursForSleeping; }

    public void drinkCoffee() {}
    public void writeCode() {}
    public void fixBugs() {}
}
