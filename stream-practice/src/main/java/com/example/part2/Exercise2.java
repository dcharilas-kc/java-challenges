package com.example.part2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Exercise2 {

    public List<String> flatten(List<List<String>> collection) {
        return collection.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream().max(Comparator.comparing(Person::getAge)).get();
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream().collect(groupingBy(Person::getNationality));
    }

    public static String namesToString(List<Person> people) {
        return String.format("Names: %s.",
                people.stream().map(p -> p.getName()).collect(Collectors.joining( ", " )));
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream().collect(groupingBy(p -> p.getAge() > 18));
    }
}
