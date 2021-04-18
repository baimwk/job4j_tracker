package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle bus = new Bus2();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{plane, bus, train};
        for (Vehicle a : vehicles) {
            System.out.println(a.getClass().getSimpleName() + ":");
            a.move();
        }
    }
}
