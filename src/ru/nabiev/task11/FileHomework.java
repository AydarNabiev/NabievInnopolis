package ru.nabiev.task11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHomework {
    public static void main(String[] args) {
        File directory = new File("D:\\JavaHomework");
        File file  = new File("D:\\JavaHomework\\ThisFile.txt");
        File file2 = new File("D:\\JavaHomework\\ThatFile.txt");
        Path source = Paths.get("D:\\JavaHomeWork");
        Path destiny = Paths.get("D:\\CopiedFile.txt");
        directory.mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Не получилось создать, надо убедиться в существовании папки.");
        }
        file.renameTo(file2);
        Path path = file2.toPath();
        try {
            Files.copy(path, destiny);
        } catch (IOException e) {
            System.out.println("Не получилось скопировать.");
        }
        file2.delete(); //очищаем файловую систему для успешного следующего прохода программы (иначе дубликация)
        try {
            Files.delete(destiny);
        } catch (IOException e) {
            System.out.println("Не получилось удалить.");
        }
    }
}
