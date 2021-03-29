package ru.job4j.professions;

public class Builder extends Engineer {
    private boolean haveHelmet;

    public Builder(String name, String surname, String education, String birthday, int yearOfExperience, String[] finishedProjects, boolean haveHelmet) {
        super(name, surname, education, birthday, yearOfExperience, finishedProjects);
        this.haveHelmet = haveHelmet;
    }

    public boolean getHaveHelmet() { return haveHelmet; }

    public void giveAdviseOnRepair() {}
}
