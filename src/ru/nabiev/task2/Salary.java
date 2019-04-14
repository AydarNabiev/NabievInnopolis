package ru.nabiev.task2;

import java.util.Scanner; //импорт сканера

public class Salary {
    public static void main(String[] args) {
        System.out.println ("Эта программа считает зарплату за вычетом НДФЛ.");
        System.out.print ("Пожалуйста, введите величину зарплаты: ");
        Scanner scanner = new Scanner(System.in); //приём данных ввода
        double a = scanner.nextDouble (); //переменная принимает значение из ввода данных
        if (a < 0) { //действие при некорректных значениях из ввода данных, могло быть улучшено при знании циклов
            System.out.print("Недопустимые значения, запустите программу ещё раз.");
        } else {
            double b = a * 0.87; //итоговая зарплата считается с вычетом 13%
            System.out.println("Итоговая зарплата: " + b + " рублей.");
        }
    }
}