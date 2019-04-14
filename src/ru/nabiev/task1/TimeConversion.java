package ru.nabiev.task1;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println ("Эта программа переводит секунды в часы.");
        double a = 3600; //на вход подаётся количество секунд из примера ДЗ
        double b = a / 3600; //секунды переводятся в часы посредством деления на 3600
        System.out.println ("3600 секунд составляют " + b + " часов.");

    }
}
