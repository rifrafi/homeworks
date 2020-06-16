package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonsStatistics {

    private List<Person> personsList;

    public PersonsStatistics(ArrayList<Person> persons) {
        this.personsList = persons;
    }

    public int average() {
        int total = 0;
        for (Person age : personsList) {
            total += age.getAge();
        }
        return total / personsList.size();
    }

    public String MaleFemaleNumbers() {
        int men = 0;
        int women = 0;

        for (Person MaleFemale : personsList) {
            if (MaleFemale.getGender().equals("Barbat")) {
                men++;
            } else {
                women++;
            }
        }

        return "Numarul barbatilor: " + men + "\n" + "Numarul femeilor: " + women;
    }

}
