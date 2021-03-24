package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error () {}

    public Error (boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError () {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        System.out.println("Error1:");
        error1.printError();
        Error error2 = new Error(true, 504, "Service Unavailable");
        System.out.println("Error2:");
        error2.printError();
        Error error3 = new Error(false, 401, "Unauthorized");
        System.out.println("Error3:");
        error3.printError();
    }
}
