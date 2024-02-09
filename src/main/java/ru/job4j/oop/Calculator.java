package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("Результат сложения: " + result);
        result = minus(5);
        System.out.println("Результат вычитания: " + result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println("Результат умножения: " + result);
        result = calculator.divide(5);
        System.out.println("Результат деления: " + result);
        result = calculator.sumAllOperation(5);
        System.out.println("Результат сложения всех операций: " + result);
    }
}
