package ru.job4j.poly;

public interface Transport {
    void go();
    void passengers(int countPassengers);
    int refuel(int fuel);
}
