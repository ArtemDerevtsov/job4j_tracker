package ru.job4j.cast;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flies across the sky");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " lands at the airport");
    }
}
