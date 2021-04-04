package ru.job4j.professions;

public class Programmer extends Engineer {
    private int hoursForCoding;

    public Programmer(String name, String surname, String education,
                      String birthday, int yearOfExperience,
                      String[] finishedProjects, int hoursForCoding) {
        super(name, surname, education, birthday, yearOfExperience, finishedProjects);
        this.hoursForCoding = hoursForCoding;
    }

    public int getHoursForCoding() {
        return hoursForCoding; }

    public void drinkCoffee() { }

    public void writeCode() { }

    public void fixBugs() { }
}
