package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class Person {


    String profession;
    String gender;
    String firstName;
    String lastName;

    LocalDate dateOfBirth;

    //Constructors

    public Person(String personFirstName, String personLastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String personGender, String personProfession) {
        this.firstName = personFirstName;
        this.lastName = personLastName;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.gender = personGender;
        this.profession = personProfession;
    }
    //Getters

    public int getAge() {
        return  Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getProfession() {
        return profession;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int compareTo(Person other) {
        int compareInt = this.firstName.compareTo(other.firstName);
        System.out.println(compareInt);
        if (compareInt < 0) return -1;
        if (compareInt > 0) return 1;
        return 0;
    }

    public void printPersonCharacteristics() {
        System.out.println("Numele complet: " + getFirstName() + " " + getLastName());
        System.out.println("Varsta: " + getAge());
        System.out.println("Gen: " + getGender());
        System.out.println("Profesia: " + getProfession());
        if (age < 18) {
            System.out.println("Persoana este minora! \n\n");
        } else {
            System.out.println("Persoana este majora! \n\n");
        }

    }

    public int average(ArrayList<Person> personsAge) {
        int total = 0;
        for (Person age : personsAge) {
            total += age.getAge();
        }
        return total / personsAge.size();
    }

    public String MaleFemaleNumbers() {
        ArrayList<String> men = new ArrayList<>();
        ArrayList<String> women = new ArrayList<>();


            if (getGender().contains("Barbat")) men.add(getLastName());
            else women.add(getLastName());


        return "Numarul barbatilor: " + men.size() + "\n" + "Numarul femeilor: " + women.size();
    }
}
