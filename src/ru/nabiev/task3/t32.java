package ru.nabiev.task3;

import java.util.Scanner;

public class t32 {
    public static void main(String[] args) {
        System.out.print("Пожалуйста, введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            if (n % 2 == 0) {
                System.out.println("Число является отрицательным четным.");
            } else {
                System.out.println("Число является отрицательным нечетным.");
            }
        } else if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Число является положительным четным.");
            } else {
                System.out.println("Число является положительным нечетным.");
            }
        } else {
            System.out.println("Значение числа является нулевым.");
        }
    }
}
