package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Comparator<Attachment> comparator = (left, right) -> Integer.compare(left.getSize(), right.getSize());
        Comparator<String> cmpSize = (left, right) -> Integer.compare(left.length(), right.length());
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> Integer.compare(right.length(), left.length());

        String[] input = {"a", "cfff", "b", "one"};
        Arrays.sort(input, cmpSize);
        for (String i : input) {
            System.out.println(i);
        }
    }
}
