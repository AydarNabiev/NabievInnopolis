package ru.nabiev.task7.task3;

public class Runner extends Human {

    @Override
    public void getName() {
        System.out.println("Я профессиональный бегун.");
    }

    @Override
    public void run() {
        System.out.println("Я обязан уметь быстро бегать для победы.");

    }

    @Override
    public void swim() {
        System.out.println("Я не обязан уметь плавать для победы.");
    }
}
