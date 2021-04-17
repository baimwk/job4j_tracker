package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Let's go");
    }

    @Override
    public void passengers(int countPassengers) {
        System.out.println("Едет " + countPassengers + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 40;
    }
}
