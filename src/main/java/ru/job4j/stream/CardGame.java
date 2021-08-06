package ru.job4j.stream;

import java.util.stream.Stream;

public class CardGame {
    public static void main(String[] args) {
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        Stream.of(suits)
                .flatMap(suit -> Stream.of(values)
                        .map(value -> suit + " " + value))
                .forEach(System.out::println);
    }
}
