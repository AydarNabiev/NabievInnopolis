package ru.nabiev.task4;

import java.time.LocalDate;

public class BankApp {
    public static void main(String[] args) {
        Client musk = new Client("Элон", "Маск", LocalDate.of(1971, 06, 28));

        musk.setMoneyLeft(23000000);

        AccountType deposit = new AccountType();

        deposit.setClients(new Client[]{musk});

        System.out.println(deposit);
    }
}
