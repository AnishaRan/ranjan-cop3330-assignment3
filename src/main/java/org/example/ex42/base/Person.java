package org.example.ex42.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class Person {
    public String fname;
    public String lname;
    public int salary;

    public Person(String fname, String lname, int salary) {
        this.salary = salary;
        this.fname = fname;
        this.lname = lname;
    }

    public String toString()
    {
        return "First Name: " + fname + "\n" + "Last Name: " + lname + "\n"
                + "Salary: " + salary;
    }
}
