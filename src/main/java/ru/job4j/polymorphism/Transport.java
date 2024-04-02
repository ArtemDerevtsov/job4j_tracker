package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void passengers(int sum);

    default double fillUp(int sum) {
        return sum * 60.5;
    }
}
