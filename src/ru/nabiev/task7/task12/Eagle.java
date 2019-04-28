package ru.nabiev.task7.task12;

public class Eagle extends Animal implements Flyable {
    @Override
    public void getName() {
        System.out.println("Я - орёл.");
    }

    @Override
    public void fly() {
        System.out.println("Я могу летать.");
    }
}
