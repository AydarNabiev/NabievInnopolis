package ru.nabiev.task14;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) throws  IOException{
        float total = 0;
        try (FileReader fr = new FileReader("products.txt");
             FileWriter fw = new FileWriter("out2.txt");
             PrintWriter pw = new PrintWriter(fw);
             Scanner sc = new Scanner(fr)) {
             sc.useLocale(Locale.ENGLISH);
             pw.printf("%14s %11s %8s %s\n", "Наименование", "Цена", "Кол-во", "Стоимость");
             pw.println("===============================================");
             while(sc.hasNext()) {
                 String name = sc.nextLine();
                 boolean isNextFloat = sc.hasNextFloat();
                 float quantity = sc.nextFloat();
                 float price = sc.nextFloat();
                 if (isNextFloat) {
                     pw.printf("%18s %6.2f x %7.3f = %.2f\n", name, price, quantity, quantity * price);
                     System.out.printf("%s\n %f\n %f = %f\n", name, price, quantity, quantity * price);
                 }
                 total += quantity * price;
                 if(sc.hasNextLine()) {
                     sc.nextLine();
                 } else {
                     pw.println("===============================================");
                     break;
                 }
             }
            pw.printf("   Итого: = %f\n", total);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");;
        }
    }
}