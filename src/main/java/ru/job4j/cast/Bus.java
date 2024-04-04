package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves along the highway");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " stops at city stations");
    }
}
