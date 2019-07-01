package ru.nabiev.task21;

import java.util.*;

public class MapApp {
    public static Map<String, Person> createMap()
    {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29,"Петрова","жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    public static void printMap(Map<String, Person> map){
        System.out.println(map.entrySet());
        for (Person key : map.values()) {
            System.out.println(key);
        }
    }

    private static Map<String, Person> removeTheDuplicates(Map<String, Person> map) {
        Set<Person> set = new HashSet<>();
        List<Person> list = new ArrayList<>();
        for (Map.Entry<String, Person> mapVal : map.entrySet()) {
            if (!set.add(mapVal.getValue())) {
                list.add(mapVal.getValue());
            } else {
                set.add(mapVal.getValue());
            }
        }
        map.values().removeAll(list);
        return map;
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value)
    {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        Map myMap = createMap();
        printMap(myMap);
        removeTheDuplicates(myMap);
        printMap(myMap);
    }
}
