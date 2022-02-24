package com.si;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String secondName;
    private int agePerson;

    public Person(String firstName, String secondName, int agePerson){
        this.firstName = firstName;
        this.secondName = secondName;
        this.agePerson = calculationAge(agePerson);

    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public int getAgePerson() {
        return agePerson;
    }
    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }


    public static int calculationAge(int agePerson){
        LocalDate dateNow = LocalDate.now(); // получаем текущую дату
        int year = dateNow.getYear();
        return (year - agePerson);

    }
}
