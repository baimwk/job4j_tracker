package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("The best", 25);
        Book second = new Book("Fish", 100);
        Book third = new Book("English", 250);
        Book fourth = new Book("Clean code", 170);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (Book book : books) {
            System.out.println(book.getName() + " " + book.getCount());
        }
        System.out.println("Change zero and third:");
        books[0] = fourth;
        books[3] = first;
        for (Book book : books) {
            System.out.println(book.getName() + " " + book.getCount());
        }
        System.out.println("Return 'Clean code':");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " " + book.getCount());
            }
        }
    }
}
