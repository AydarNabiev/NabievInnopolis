package ru.nabiev.task7.task12;

public class Dog extends Animal implements Runnable, Swimmable {
    @Override
    public void getName() {
        System.out.println("Я - собака.");
    }

    @Override
    public void run() {
        System.out.println("Я могу бегать.");

    }

    @Override
    public void swim() {
        System.out.println("Я могу плавать.");
    }
}
