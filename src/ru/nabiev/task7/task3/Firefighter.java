package ru.nabiev.task7.task3;

public class Firefighter extends Human {
    @Override
    public void getName() {
        System.out.println("Я пожарный.");
    }

    @Override
    public void run() {
        System.out.println("Я обязан уметь быстро бегать для спасения жизней.");
    }

    @Override
    public void swim() {
        System.out.println("Я не обязан уметь плавать для спасения жизней.");
    }
}
