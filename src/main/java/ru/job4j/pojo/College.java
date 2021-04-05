package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Leonteva D. P. ");
        student.setGroup("Junior-12 ");
        student.setStartDate(new Date());
        System.out.println(student.getFio() + student.getGroup() + student.getStartDate());
    }
}
