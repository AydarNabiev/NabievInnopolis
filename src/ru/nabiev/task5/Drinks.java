package ru.nabiev.task5;

public class Drinks {

    // TODO: 13.05.2019 этот класс сейчас не нужен, т к в автомате создали enum 
    // TODO: 13.05.2019 ЛИБО в автомате создаем массив, туда кадем все значения из этого enum, из автомата удаляем enum DrinksList 

    private String name;
    private int price;

    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
            return name;
        }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}