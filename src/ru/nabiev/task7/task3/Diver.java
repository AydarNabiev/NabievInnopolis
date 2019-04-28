package ru.nabiev.task7.task3;

public class Diver extends Human {
    @Override
    public void getName() {
        System.out.println("Я водолаз.");
    }

    @Override
    public void run() {
        System.out.println("Я не обязан уметь быстро бегать для выполнения своих обязанностей.");
    }

    @Override
    public void swim() {
        System.out.println("Я обязан уметь хорошо плавать для выполнения своих обязанностей.");
    }
}
