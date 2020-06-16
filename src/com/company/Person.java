package com.company;

import java.time.LocalDate;
import java.time.Period;


public class Person {


    String profession;
    String gender;
    String LastName;
    String FirstName;

    LocalDate dateOfBirth;

    //Constructors

    public Person(String personFirstName, String personLastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String personGender, String personProfession) {
        this.LastName = personFirstName;
        this.FirstName = personLastName;
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
        return LastName;
    }

    public String getLastName() {
        return FirstName;
    }

    public int compareTo(Person other) {
        int compareInt = this.LastName.compareTo(other.LastName);
        if (compareInt < 0) return -1;
        if (compareInt > 0) return 1;
        return 0;
    }

    public void printPersonCharacteristics() {
        System.out.println("Numele complet: " + getLastName() + " " + getLastName());
        System.out.println("Varsta: " + getAge());
        System.out.println("Gen: " + getGender());
        System.out.println("Profesia: " + getProfession());
        if (getAge() < 18) {
            System.out.println("Persoana este minora! \n\n");
        } else {
            System.out.println("Persoana este majora! \n\n");
        }

    }



}
