package ru.nabiev.task7.task3;

public class App {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Rescuer rescuer = new Rescuer();
        Firefighter firefighter = new Firefighter();
        Diver diver = new Diver();

        runner.getName();
        runner.run();
        runner.swim();

        rescuer.getName();
        rescuer.run();
        rescuer.swim();

        firefighter.getName();
        firefighter.run();
        firefighter.swim();

        diver.getName();
        diver.run();
        diver.swim();
    }
}
