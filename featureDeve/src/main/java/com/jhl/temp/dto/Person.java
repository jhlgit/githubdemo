package com.jhl.temp.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public static void processPersonsWithFunction(
            List<Person> roster,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setName(String.valueOf(i));
            person.setAge(i);
            if (i % 2 == 0) {
                person.setGender(Sex.MAL);
            } else {
                person.setGender(Sex.FEMAL);

            }
            person.setEmailAddress("e"+i);
            roster.add(person);
        }
//        Person.printPersonsOlderThan(roster, 3);
//        Person.printperson(roster,
//                a -> a.getGender() == Sex.MAL
//        );

        Person.processPersonsWithFunction(roster,
                p -> p.getGender() == Sex.MAL && p.getAge() > 3,
                p -> p.getEmailAddress(),
                p -> System.out.println(p)
        );


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
