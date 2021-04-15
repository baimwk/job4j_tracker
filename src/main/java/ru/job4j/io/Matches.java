package ru.job4j.io;
import java.util.Arrays;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            Integer[] i = new Integer[] {1, 2, 3};
            if (Arrays.asList(i).contains(matches)) {
                turn = !turn;
                count = count - matches > 0 ? count - matches : 0;
                System.out.println("На столе " + count + " спичек.");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
