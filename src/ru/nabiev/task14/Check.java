package ru.nabiev.task14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        //File sourceFile = new File("products.txt");
        try (FileReader fr = new FileReader("products.txt");
            Scanner sc = new Scanner(fr)
        ){
            sc.useLocale(Locale.ENGLISH);
            //sc.useDelimiter(" ");
            while(sc.hasNext()) {
                String name = sc.nextLine();
                System.out.println("Строка " + name);
                Float quantity = sc.nextFloat();
                System.out.println("Количество " + quantity);
                Float price = sc.nextFloat();
                System.out.println("Цена " + price);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}