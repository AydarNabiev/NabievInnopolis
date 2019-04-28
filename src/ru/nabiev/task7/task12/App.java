package ru.nabiev.task7.task12;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Hippo hippo = new Hippo();
        Duck duck = new Duck();

        dog.getName();
        dog.run();
        dog.swim();

        eagle.getName();
        eagle.fly();

        hippo.getName();
        hippo.run();
        hippo.swim();

        duck.getName();
        duck.run();
        duck.fly();
        duck.swim();
    }
}
