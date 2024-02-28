package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Core Java", 866);
        Book second = new Book("War and Peace", 1300);
        Book third = new Book("1984", 320);
        Book fourth = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book title: " + book.getName() + ", number of pages: " + book.getCount());
        }

        System.out.println("Swap");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book title: " + book.getName() + ", number of pages: " + book.getCount());

        }
        System.out.println("Show only \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println("Book title only: " + book.getName());
                break;
            }
        }
    }
}
