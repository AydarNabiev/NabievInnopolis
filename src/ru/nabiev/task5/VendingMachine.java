package ru.nabiev.task5;

import java.util.Scanner;

public class VendingMachine {
    static int account = 0;

    public static int getAccount() {
        return account;
    }

    public static void setAccount(int account) {
        VendingMachine.account = account;
    }

    public void mainMenu () {
        System.out.println("Пожалуйста, выберите: 1) Показать меню напитков");
        System.out.println("2) Выйти из программы");
        System.out.println("Введите номер команды для выбора. ");

    }

    public static void addMoney () {
        System.out.println("Пожалуйста, добавьте деньги на счёт (вводом количества вносимых денег): ");
    }
}