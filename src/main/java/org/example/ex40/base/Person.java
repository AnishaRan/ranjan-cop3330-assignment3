package org.example.ex40.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class Person {

    public String firstName;
    public String lastName;
    public String position;
    public String separation_date;

    public Person(String firstName, String lastName, String position, String separation_date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separation_date = separation_date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeparation_date() {
        return separation_date;
    }

    public void setSeparation_date(String separation_date) {
        this.separation_date = separation_date;
    }
}
