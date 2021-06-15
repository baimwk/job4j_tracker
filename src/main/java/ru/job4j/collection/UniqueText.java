package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.toLowerCase().split(" ");
        String[] text = duplicateText.toLowerCase().split(" ");
        HashSet<String> check = new HashSet<>();
        for (String or : origin) {
            check.add(or);
        }
        for (String t : text) {
            if (!check.contains(t)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
