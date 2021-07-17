package com.jhl.book;

import com.jhl.entity.dto.Person;
import com.jhl.utils.JsonUtils;

import java.util.Comparator;
import java.util.List;

/**
 * @Description
 * @Author jhl
 * @Date 2021/5/25 9:49
 * @Version 1.0
 */
public class Java8InAction {

    public void lambdaExpress() {
        List<Person> personList = Person.createList(5);
        String s1 = JsonUtils.toJsonString(personList);
        personList.sort((Person p1, Person p2) -> {
            Integer.compare(p2.getAge(), p1.getAge());
            return 1;
        });
        personList.sort(Comparator.comparing(Person::getAge));
        String s = JsonUtils.toJsonString(personList);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Java8InAction java8InAction = new Java8InAction();
        java8InAction.lambdaExpress();
    }
}
