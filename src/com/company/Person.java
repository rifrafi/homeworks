package com.company;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    int age;


    String profession;
    String gender;
    String firstName;
    String lastName;

    LocalDate dateOfBirth;
    LocalDate Present;

    //Constructors

    public Person(String personFirstName, String personLastName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String personGender, String personProfession) {
        this.firstName = personFirstName;
        this.lastName = personLastName;
        this.Present = LocalDate.now();
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.age = Period.between(dateOfBirth, Present).getYears();
        this.gender = personGender;
        this.profession = personProfession;
    }
    //Getters

    public int getAge() {
        return this.age;
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

    public void printPersonCharacteristics() {
        System.out.println("Numele complet: " + getFirstName() + " " + getLastName());
        System.out.println("Varsta: " + getAge());
        System.out.println("Gen: " + getGender());
        System.out.println("Profesia: " + getProfession());
        if(age <18){
            System.out.println("Persoana este minora!");
        }else {
            System.out.println("Persoana este majora!");
        }
        System.out.println();
        System.out.println();
    }
}
