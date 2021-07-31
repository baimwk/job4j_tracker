package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(-2);
        ints.add(4);
        ints.add(3);
        ints.add(0);
        List<Integer> rsl = ints.stream().filter(
                i -> i > 0
        ).collect(Collectors.toList());
        System.out.println(rsl);
    }
}
