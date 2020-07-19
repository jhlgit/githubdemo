package com.jhl.service;

import com.jhl.entity.dto.Person;

public class CheckPersonImpl implements CheckPerson {


    @Override
    public boolean test(Person person) {
        return person.getGender()==Person.Sex.MAL & person.getAge()>3;
    }

    public boolean test2(Person person) {
        return false;
    }
}
