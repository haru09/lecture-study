package com.example.stream;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class StreamTestFirst {
    static List<Person> persons;

    @BeforeAll
    static void beforeSet(){
        persons = new ArrayList<Person>();

        persons.add(new Person("Park", 35));
        persons.add(new Person("Kim", 28));
        persons.add(new Person("Eom", 42));
        persons.add(new Person("Lee", 30));
        persons.add(new Person("Eun", 55));
        persons.add(new Person("Choi", 33));
    }

    @Test
    public void notUserdTest() {
        log.info("==============notUserdTest======");
        List<Person> list = new ArrayList<>();

        for(Person person : persons){
            if(person.getAge() > 30) {
                list.add(person);
            }
        }       // age > 30 이상

        Collections.sort(list);     // 오름차순

        List<String> results = new ArrayList<String>();

        for(Person person : list){
            results.add(person.getName());
        } // 이름

        for(String name : results){
            System.out.println(name);
        }
    }

    @Test
    public void usedTest() {
        log.info("==============usedTest======");
        List<String> PersonsNames = persons.stream()
                .filter(Person -> Person.getAge() > 30)
                .sorted()
                .map(Person::getName)
                .collect(Collectors.toList());

        for(String name : PersonsNames){
            System.out.println(name);
        }
    }
}
