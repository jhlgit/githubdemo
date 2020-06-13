package com.jhl.temp.service;

import com.jhl.temp.dto.Person;

public interface CheckPerson {
    boolean test(Person person);

    default boolean test2(Person person) {
        return false;
    }
}
