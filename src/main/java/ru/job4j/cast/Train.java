package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves on the rails");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " stops at stations");
    }
}
