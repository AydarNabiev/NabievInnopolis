package ru.nabiev.task3;

import java.util.Scanner;

public class t31 {
    public static void main(String[] args) {
        System.out.print("Пожалуйста, введите первое число: ");
        Scanner scanner1 = new Scanner (System.in);
        int n1 = scanner1.nextInt();
        System.out.print("Пожалуйста, введите второе число: ");
        Scanner scanner2 = new Scanner (System.in);
        int n2 = scanner2.nextInt();
        if (n1 > n2) {
            System.out.println ("Минимальным числом является второе: " + n2);
        } else if (n1 < n2) {
            System.out.println ("Минимальным числом является первое: " + n1);
        } else {
            System.out.println ("Минимального числа нет, так как они равны.");
        }

    }
}
