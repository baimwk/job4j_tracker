package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return right.compareTo(left);
        };

        String[] input = {"a", "c", "b", "one"};
        Arrays.sort(input, cmpText);
        for (String i : input) {
            System.out.println(i);
        }
    }
}
