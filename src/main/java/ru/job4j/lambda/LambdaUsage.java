package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + left + " : " + right);
            return Integer.compare(right.length(), left.length());
        };

        String[] input = {"a", "cb", "b", "one"};
        Arrays.sort(input, cmpDescSize);
        for (String i : input) {
            System.out.println(i);
        }
    }
}
