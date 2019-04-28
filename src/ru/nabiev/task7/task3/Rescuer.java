package ru.nabiev.task7.task3;

public class Rescuer extends Human{
    @Override
    public void run() {
        System.out.println("Я обязан быстро бежать для спасения тонущих.");
    }

    @Override
    public void swim() {
        System.out.println("Я обязан уметь плавать для спасения тонущих.");
    }

    @Override
    public void getName() {
        System.out.println("Я спасатель на пляже.");
    }
}
