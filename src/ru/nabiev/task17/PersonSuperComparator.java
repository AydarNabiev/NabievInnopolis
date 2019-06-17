package ru.nabiev.task17;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int i = o1.name.compareTo(o2.name);
        if (i != 0) return i;

        return Integer.compare(o1.age, o2.age);
    }
}