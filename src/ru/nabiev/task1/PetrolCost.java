package ru.nabiev.task1;

public class PetrolCost {
    public static void main(String[] args) {
        System.out.println ("Эта программа выводит стоимость бензина.");
        int a = 50; //на вход подаётся количество литров из примера ДЗ
        int b = a * 43; //стоимость бензина получается из кол-ва литров на стоимость одного литра
        System.out.println ("Стоимость 50 литров бензина равна: " + b + " рублей.");
    }
}
