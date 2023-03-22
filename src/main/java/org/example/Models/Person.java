package org.example.Models;
import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private String user;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String user, String password) {
        this.user = user;
        this.password = writeAPassword();
    }

    private String newPassword(String password) {
        if (!Validators.isACorrectPassword(password)){
            writeAPassword();
        }
        return password;
    }

    private String writeAPassword() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a password with a uppercase, lowcase, number and min length of 6");
        String newPassword = read.next();
        return newPassword(newPassword);
    }

}
