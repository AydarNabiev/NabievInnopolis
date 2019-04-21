package ru.nabiev.task4;

import java.time.LocalDate;

public class Client extends Person {
    private int moneyLeft;

    public Client(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
    }

    public int getMoneyLeft() {
        return moneyLeft;
    }

    public void setMoneyLeft(int MoneyLeft) {
        this.moneyLeft = MoneyLeft;
    }
}