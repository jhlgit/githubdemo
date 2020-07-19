package com.jhl.service;

import com.jhl.entity.dto.Person;

public interface CheckPerson {
    boolean test(Person person);

    default boolean test2(Person person) {
        return false;
    }
}
