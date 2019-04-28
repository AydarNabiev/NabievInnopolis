package ru.nabiev.task4;

import java.util.Arrays;

public class AccountType {
    private String title;
    private Client[] clients = new Client[5];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "title='" + title + '\'' +
                ", clients=" + Arrays.toString(clients) +
                '}';
    }
}