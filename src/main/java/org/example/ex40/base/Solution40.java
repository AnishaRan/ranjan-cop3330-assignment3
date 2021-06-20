package org.example.ex40.base;

import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Anisha Ranjan
 */

public class Solution40 {
    public static void main(String[] args) {
        // data is given
        // create Person class for everyone
        makingPerson();
            // store data using a list of maps
        // get user input
       //Map<String, List<Person>> data_people = new Map<>();
        // let user locate all records that match search string
            // compare search string to first and last name of everyone
            // key can be first name


    }

    public static void makingPerson() {
        //ArrayList<Map<String, Person>> people_data = new ArrayList<>(6);


        Map<String, Person> people = new HashMap<>();
        // create Person class for everyone
        Person John = new Person("John", "Johnson", "Manager", "2016-12-31");
        Person Tou = new Person("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Person Michaela = new Person("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Person Jake = new Person("Jake", "Jacobson", "Programmer", "");
        Person Jacquelyn = new Person("Jacquelyn", "Jackson", "DBA", "");
        Person Sally = new Person("Sally", "Webber", "Web Developer", "2015-12-18");

        List<Map<String, Person>> list = new ArrayList<>();
        Map<String, Person> map = new HashMap<>();
        map.put("Johnson", John);
        map.put("Xiong", Tou);
        map.put("Michaelson", Michaela);
        map.put("Jackson", Jacquelyn);
        map.put("Jacobson", Jake);
        map.put("Webber", Sally);

        list.add(map);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String search_string = in.next();

        /*
        * Receive search_string
        * Check if search string has any values in common with key set
        *   if it does, check which keys it is common with w/ for loop
        * Print common value keys
        * */
        String[] keys = {"Johnson", "Xiong", "Michaelson", "Jackson", "Jacobson", "Webber"};
        Set<String> name = list.get(0).keySet();
        String strName = name.toString();

        if(strName.contains(search_string)) {
            System.out.println("Name                | Position          | Separation Date");
            System.out.println("--------------------|-------------------|----------------");
            for(int i = 0; i < map.size(); i++) {
                if(keys[i].contains(search_string)) {
                    System.out.printf("%-9s %-9s | %-17s | %-10s", list.get(0).get(keys[i]).firstName, list.get(0).get(keys[i]).lastName, list.get(0).get(keys[i]).position, list.get(0).get(keys[i]).separation_date);
                    System.out.println();
                }

            }
        }


    }

}
