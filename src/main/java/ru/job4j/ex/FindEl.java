package ru.job4j.ex;

import java.util.Arrays;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        boolean contains = Arrays.asList(abuses).contains(value);
        if (contains) {
            throw new ElementAbuseException("Key in abuses");
        }
        return contains;
    }

    public static void main(String[] args) {
        String[] value = {"test", "a", "b"};
        String[] abuses = {"test1", "test"};
        String key = "test";
        try {
            if (indexOf(value, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
