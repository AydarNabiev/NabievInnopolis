package ru.nabiev.task1;

public class Salary {
    public static void main(String[] args) {
        System.out.println ("Эта программа считает зарплату за вычетом НДФЛ.");
        double a = 70000; //на вход подаётся величина зарплаты из примера ДЗ
        double b = a * 0.87; //итоговая зарплата считается с вычетом 13%
        System.out.println ("Зарплата 70000 рублей после вычета НДФЛ стала: " + b + " рублей.");
    }
}
