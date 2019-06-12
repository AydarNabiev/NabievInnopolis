package ru.nabiev.task17;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Ann", 18));
        personList.add(new Person("Bryan", 30));
        personList.add(new Person("Ann", 24));

        System.out.println("Было " + Arrays.toString(personList.toArray()));

        personList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        System.out.println("Стало " + Arrays.toString(personList.toArray()));
    }
}