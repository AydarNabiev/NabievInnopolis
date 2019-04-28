package ru.nabiev.task7.task12;

public class Hippo extends Animal implements Runable, Swimmable{
    @Override
    public void getName() {
        System.out.println("Я - бегемот.");
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
