package com.jhl.entity.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Person {
    public enum Sex {
        MAL, FEMAL;
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;

    String username;
    String password;


    public void printperson() {
        System.out.println(this.age);
        System.out.println();
    }


    public static void printperson(List<Person> roster, Predicate<Person> tester) {
        System.out.println(111);
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printperson();
            }
        }
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() > age) {
                p.printperson();
            }
        }
    }



    public static void main(String[] args) {
        createList(10);
//        Person.printPersonsOlderThan(roster, 3);
//        Person.printperson(roster,
//                a -> a.getGender() == Sex.MAL
//        );




    }

    public static List<Person> createList(int size) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Person person = new Person();
            person.setName(String.valueOf(i));
            person.setAge(i);
            if (i % 2 == 0) {
                person.setGender(Sex.MAL);
            } else {
                person.setGender(Sex.FEMAL);

            }
            person.setEmailAddress("e"+i);
            personList.add(person);
        }
        return personList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
