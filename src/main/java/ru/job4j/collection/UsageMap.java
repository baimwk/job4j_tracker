package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("test@yandex.ru", "Darya Leonteva");
        map.put("qwerty@gmail.com", "Test www");
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("qwerty@gmail.com", "Test Testovich");
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
