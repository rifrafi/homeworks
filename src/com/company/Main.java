package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> goodPeople = new ArrayList<>();
        Person CojocaruNicolae = new Person("Cojocaru", "Nicolae", 1988, 12, 11,
                "Barbat", "Tamplar");
        Person PopescuMariana = new Person("Popescu", "Mariana", 1920, 9, 13,
                "Femeie", "Contabil");
        Person CostacheMircea = new Person("Costache", "Mircea", 2004, 10, 14,
                "Barbat", "Elev");
        Person BaciuIonel = new Person("Baciu", "Ionel", 2010, 2, 24,
                "Barbat", "Elev");
        Person BerneaErnest = new Person("Bernea", "Ernest", 2011, 10, 14,
                "Barbat", "Elev");
        Person GrigorescuLucian = new Person("Grigorescu", "Lucian", 2000, 7, 9,
                "Barbat", "Student");
        Person BobeleaMarghioala = new Person("Bobelea", "Marghioala", 1993, 12, 12,
                "Femeie", "Notar");
        Person TanaseAndreea = new Person("Tanase", "Andreea", 1950, 6, 10,
                "Femeie", "Sudor");
        Person LupuCristian = new Person("Lupu", "Cristian", 1999, 1, 19,
                "Barbat", "Medic");
        Person LupuIonut = new Person("Lupu", "Ionut", 1996, 2, 20,
                "Barbat", "Instalator");
        goodPeople.add(CojocaruNicolae);
        goodPeople.add(PopescuMariana);
        goodPeople.add(CostacheMircea);
        goodPeople.add(BaciuIonel);
        goodPeople.add(BerneaErnest);
        goodPeople.add(GrigorescuLucian);
        goodPeople.add(BobeleaMarghioala);
        goodPeople.add(TanaseAndreea);
        goodPeople.add(LupuCristian);
        goodPeople.add(LupuIonut);

            


        for (Person people:goodPeople) {
            people.printPersonCharacteristics();
        }


    }


}

