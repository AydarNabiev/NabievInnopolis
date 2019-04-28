package ru.nabiev.task7.task12;

public class Duck extends Animal implements Flyable, Swimmable, Runnable {
    @Override
    public void getName() {
        System.out.println("Я - утка.");
    }

    @Override
    public void run() {
        System.out.println("Я могу бегать.");
    }

    @Override
    public void fly() {
        System.out.println("Я могу летать.");
    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать.");
    }
}
