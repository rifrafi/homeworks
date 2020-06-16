package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList<Person> goodPeople = new ArrayList<>(
                Arrays.asList(new Person("Cojocaru", "Nicolae", 1988, 12, 11,
                                "Barbat", "Tamplar"),
                        new Person("Popescu", "Mariana", 1920, 9, 13,
                                "Femeie", "Contabil"),
                        new Person("Costache", "Mircea", 2004, 10, 14,
                                "Barbat", "Elev"),
                        new Person("Baciu", "Ionel", 2010, 2, 24,
                                "Barbat", "Elev"),
                        new Person("Bernea", "Ernest", 2011, 10, 14,
                                "Barbat", "Elev"),
                        new Person("Grigorescu", "Lucian", 2000, 7, 9,
                                "Barbat", "Student"),
                        new Person("Bobelea", "Marghioala", 1993, 12, 12,
                                "Femeie", "Notar"),
                        new Person("Tanase", "Andreea", 1950, 6, 10,
                                "Femeie", "Sudor"),
                        new Person("Lupu", "Cristian", 1999, 1, 19,
                                "Barbat", "Medic"),
                        new Person("Lupu", "Ionut", 1996, 2, 20,
                                "Barbat", "Instalator")));

        Collections.sort(goodPeople,(Person o1, Person o2) -> o1.compareTo((o2)));


        PersonsStatistics statistics = new PersonsStatistics(goodPeople);


        for (Person people : goodPeople) {
            people.printPersonCharacteristics();
        }
        System.out.println("Varsta medie: " + statistics.average());
        System.out.println(statistics.MaleFemaleNumbers());


    }

}




