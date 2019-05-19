package ru.nabiev.task11;

import java.io.File;

public class RecursionHomework {
    public static void main(String[] args) {
        File file = new File("D://Parent");
        System.out.println("Исходная папка " + file.getName() + " с внутренними файлами:");
        recusiveShow(file);
    }

    private static void recusiveShow(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println("Файл " + file1.getName());
            } else {
                System.out.println("Папка " + file1.getName());
                recusiveShow(file1);
            }
        }
    }
}
