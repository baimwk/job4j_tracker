package ru.job4j.professions;

public class Engineer extends Profession {
    private int yearOfExperience;
    private String[] finishedProjects;

    public Engineer(String name, String surname, String education, String birthday, int yearOfExperience, String[] finishedProjects) {
        super(name, surname, education, birthday);
        this.yearOfExperience = yearOfExperience;
        this.finishedProjects = finishedProjects;
    }

    public int getYearOfExperience() { return yearOfExperience; }
    public String[] getFinishedProjects() { return finishedProjects; }

    public void canFixEverything() {}
}
