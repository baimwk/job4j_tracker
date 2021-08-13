package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        return students.keySet().stream()
                .filter(s -> s.getAccount().equals(account))
                .findFirst();
    }

    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> student = findByAccount(account);
        Optional<Subject> rsl = Optional.empty();
        if (student.isPresent()) {
            rsl = students.get(student.get())
                    .stream()
                    .filter(s -> s.getName().equals(name))
                    .findFirst();
        }
        return rsl;
    }
}
