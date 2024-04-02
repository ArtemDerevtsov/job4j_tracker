package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int sum) {
    }

    @Override
    public double fillUp(int sum) {
      return 0;
    }
}
