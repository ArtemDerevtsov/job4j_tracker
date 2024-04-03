package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int sum) {
        int amount = 0;
        amount += sum;
        System.out.println("Количество пассажиров" + amount);
    }

    @Override
    public double fillUp(int sum) {
      return sum * 65.5;
    }
}
