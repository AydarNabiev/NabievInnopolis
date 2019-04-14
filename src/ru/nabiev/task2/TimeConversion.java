package ru.nabiev.task2;

import java.util.Scanner; //импорт сканера

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println ("Эта программа переводит секунды в часы.");
        System.out.print ("Пожалуйста, введите количество секунд: ");
        Scanner scanner = new Scanner(System.in); //приём данных ввода
        double a = scanner.nextDouble (); //переменная принимает значение из ввода данных
        if (a < 0) { //действие при некорректных значениях из ввода данных, могло быть улучшено при знании циклов
            System.out.print("Недопустимые значения, запустите программу ещё раз.");
        } else {
            double b = a / 3600; //секунды переводятся в часы посредством деления на 3600
            System.out.println("Количество часов: " + b + ".");
        }
    }
}