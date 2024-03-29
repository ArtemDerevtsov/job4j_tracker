package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error one = new Error();
        one.printInfo();
        Error two = new Error(true, 1, "Error detected");
        two.printInfo();
        Error three = new Error(false, 2, "No errors found");
        three.printInfo();
    }

}
