package ru.nabiev.task8;

import java.util.Scanner;

public class Censor {


    public static void main(String[] args) {
        String output;
        String outputFinal;
        System.out.println("Пожалуйста, введите текст: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        output = text.replaceAll("бяка", "вырезано цензурой");
        outputFinal = output.replaceAll("Бяка", "вырезано цензурой");
        //не лучшее решение для случая, если бяка написано с большой буквы, не учитаны случаи других больших букв
        System.out.println(outputFinal);
    }
}