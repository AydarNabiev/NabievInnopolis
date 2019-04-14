package ru.nabiev.task2;

import java.util.Scanner; //импорт сканера

public class PetrolCost {
    public static void main(String[] args) {
        System.out.println ("Эта программа выводит стоимость бензина.");
        System.out.print ("Пожалуйста, введите количество литров: ");
        Scanner scanner = new Scanner(System.in); //приём данных ввода
        double a = scanner.nextDouble (); //переменная принимает значение из ввода данных
        if (a < 0) { //действие при некорректных значениях из ввода данных, могло быть улучшено при знании циклов
            System.out.print("Недопустимые значения, запустите программу ещё раз.");
        } else {
            double b = a * 43; //стоимость бензина получается из кол-ва литров на стоимость одного литра
            System.out.println ("Стоимость бензина равна: " + b + " рублей.");
        }
    }
}